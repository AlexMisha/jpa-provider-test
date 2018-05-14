package com.shepard.jpaprovidertest.driver

import com.sun.rowset.CachedRowSetImpl
import java.lang.reflect.Field
import java.sql.ResultSet
import java.sql.ResultSetMetaData
import java.sql.Types
import java.util.logging.Logger
import javax.sql.rowset.RowSetMetaDataImpl

fun <T> resultSetOf(values: List<T>,
                    types: List<Int>,
                    providerType: ProviderType,
                    innerResultSets: List<ResultSet> = emptyList(),
                    inner: Boolean = false): ResultSet =
        ResultSetImpl(values, innerResultSets, ResultSetMetaDataImpl(types, RowSetMetaDataImpl()), providerType, inner)

enum class ProviderType(val index: Int) {
    HIBERNATE(0),
    ECLIPSE_LINK(1)
}

class ResultSetImpl<T>(
        private val values: List<T>,
        private val innerResultSets: List<ResultSet>,
        private val metadata: ResultSetMetaDataImpl,
        providerType: ProviderType,
        inner: Boolean
) : CachedRowSetImpl() {
    private val fieldCount = values.size * metadata.types.size
    private var currentField: Int = if (inner) inner.toInt() - providerType.index else 0

    private var delegateToInner = false
    private var delegatesCounter = 0

    val logger: Logger = Logger.getLogger(javaClass.name)

    override fun getMetaData(): ResultSetMetaData = metadata

    override fun next(): Boolean {
        logger.info("next delegateToInner: $delegateToInner")
        if (delegateToInner && delegatesCounter < innerResultSets.size) {
            val next = innerResultSets[delegatesCounter].next()
            if (!next) delegatesCounter++
            return next
        }

        logger.info("currentField < fieldCount = ${currentField < fieldCount}")
        val next = currentField < fieldCount
        delegateToInner = !next
        return next
    }

    override fun getString(key: String?): String {
        logger.info("getString key: $key")
        return if (!delegateToInner) values[currentField++ / metadata.types.size] fieldValueBy key
        else innerResultSets[delegatesCounter].getString(key)
    }

    override fun getBoolean(key: String?): Boolean {
        logger.info("getBoolean key: $key")
        return if (!delegateToInner) values[currentField++ / metadata.types.size] fieldValueBy key
        else innerResultSets[delegatesCounter].getBoolean(key)
    }

    override fun getInt(key: String?): Int {
        logger.info("getInt key: $key")
        return values[currentField++ / metadata.types.size] fieldValueBy key
    }

    override fun getLong(key: String?): Long {
        logger.info("getLong key: $key")
        return if (!delegateToInner) values[currentField++ / metadata.types.size] fieldValueBy key
        else innerResultSets[delegatesCounter].getLong(key)
    }

    override fun getString(index: Int): String {
        logger.info("getString index: $index")
        return if (!delegateToInner) values[currentField++ / metadata.types.size] fieldValueBy index
        else innerResultSets[delegatesCounter].getString(index)
    }

    override fun getLong(index: Int): Long {
        logger.info("getLong index: $index")
        return if (!delegateToInner) values[currentField++ / metadata.types.size] fieldValueBy index
        else innerResultSets[delegatesCounter].getLong(index)
    }

    override fun getBoolean(index: Int): Boolean {
        return values[currentField++ / metadata.types.size] fieldValueBy index
    }

    override fun getInt(index: Int): Int {
        return values[currentField++ / metadata.types.size] fieldValueBy index
    }

    override fun toString(): String {
        return "ResultSetImpl(values=$values, innerResultSets=$innerResultSets, currentField=$currentField, delegateToInner=$delegateToInner, delegatesCounter=$delegatesCounter)"
    }
}

@Suppress("UNCHECKED_CAST", "NAME_SHADOWING")
inline infix fun <reified V> Any?.fieldValueBy(name: String?): V {
    Logger.getLogger("fieldValueBy(String)").info("return type: ${V::class.java}")
    val obj = requireNotNull(this)
    val name = requireNotNull(name)

    val fieldValue = (obj.javaClass fieldBy name)[this]

    return if (fieldValue is V) fieldValue
    else (fieldValue.javaClass fieldBy V::class.java)[fieldValue] as V
}

@Suppress("UNCHECKED_CAST", "NAME_SHADOWING")
inline infix fun <reified V> Any?.fieldValueBy(index: Int): V {
    Logger.getLogger("fieldValueBy(Int)").info("return type: ${V::class.java}")

    val obj = requireNotNull(this)
    val index = requireNotNull(index)

    val fieldValue = (obj.javaClass fieldBy index - 1)[obj]

    return if (fieldValue is V) fieldValue
    else (fieldValue.javaClass fieldBy V::class.java)[fieldValue] as V
}

infix fun <T> Class<T>.fieldBy(name: String): Field =
        declaredFields.single { it.name in name }.apply { isAccessible = true }

infix fun <T, X> Class<T>.fieldBy(type: Class<X>): Field {
    Logger.getLogger("fieldBy(Class)").info("fieldBy returnType: $type, this: $this")
    return declaredFields.single { type.isAssignableFrom(it.type) }.apply { isAccessible = true }
}

infix fun <T> Class<T>.fieldBy(index: Int): Field = declaredFields[index].apply { isAccessible = true }

class ResultSetMetaDataImpl(
        val types: List<Int>,
        resultSetMetaData: ResultSetMetaData
) : ResultSetMetaData by resultSetMetaData {
    override fun getColumnCount() = types.size

    override fun getColumnType(column: Int) = types.getOrElse(column - 1) { Types.NULL }
}

fun Boolean.toInt() = if (this) 1 else 0