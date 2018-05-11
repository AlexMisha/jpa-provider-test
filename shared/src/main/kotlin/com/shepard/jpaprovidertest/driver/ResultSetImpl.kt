package com.shepard.jpaprovidertest.driver

import com.sun.rowset.CachedRowSetImpl
import java.sql.ResultSet
import java.sql.ResultSetMetaData
import java.sql.Types
import javax.sql.rowset.RowSetMetaDataImpl

fun resultSetOf(type: Class<*>, values: Map<String, Any>, types: List<Int>): ResultSet =
        ResultSetImpl(type).apply {
            indexedValues.putAll(values)
            metadata = ResultSetMetaDataImpl(types, RowSetMetaDataImpl())
        }

class ResultSetImpl(private val type: Class<*>) : CachedRowSetImpl() {
    val indexedValues: MutableMap<String, Any> = mutableMapOf()
    lateinit var metadata: ResultSetMetaData

    override fun getMetaData(): ResultSetMetaData = metadata

    override fun next() = indexedValues.isNotEmpty()

    override fun getString(key: String?) = indexedValues.getAndRemoveByJdbcKey(key) as String

    override fun getBoolean(key: String?) = indexedValues.getAndRemoveByJdbcKey(key) as Boolean

    override fun getInt(key: String?) = indexedValues.getAndRemoveByJdbcKey(key) as Int

    override fun getLong(key: String?) = indexedValues.getAndRemoveByJdbcKey(key) as Long

    override fun getString(index: Int) = getString(type fieldNameBy index)

    override fun getLong(index: Int) = getLong(type fieldNameBy index)

    override fun getBoolean(index: Int) = getBoolean(type fieldNameBy index)

    override fun getInt(index: Int) = getInt(type fieldNameBy index)
}

fun <V> MutableMap<String, V>.getAndRemoveByJdbcKey(key: String?): V? {
    @Suppress("NAME_SHADOWING")
    val key = requireNotNull(key)
    val (resultKey, result) = asSequence().filter { it.key in key }.single()
    remove(resultKey)
    return result
}

infix fun Class<*>.fieldNameBy(index: Int): String = declaredFields[index - 1].name

class ResultSetMetaDataImpl(
        private val types: List<Int>,
        resultSetMetaData: ResultSetMetaData
) : ResultSetMetaData by resultSetMetaData {
    override fun getColumnCount() = types.size

    override fun getColumnType(column: Int) = types.getOrElse(column - 1) { Types.NULL }
}