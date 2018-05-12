package com.shepard.jpaprovidertest.driver

import com.sun.rowset.CachedRowSetImpl
import java.sql.ResultSet
import java.sql.ResultSetMetaData
import java.sql.Types
import java.util.logging.Logger
import javax.sql.rowset.RowSetMetaDataImpl

fun <T> resultSetOf(values: List<T>, types: List<Int>): ResultSet = ResultSetImpl(values).apply {
    metadata = ResultSetMetaDataImpl(types, RowSetMetaDataImpl())
}

class ResultSetImpl<T>(private val values: List<T>) : CachedRowSetImpl() {
    lateinit var metadata: ResultSetMetaDataImpl

    private val fieldCount by lazy { values.size * metadata.types.size }
    private var currentField = 0

    val logger: Logger = Logger.getLogger(javaClass.name)

    override fun getMetaData(): ResultSetMetaData = metadata

    override fun next() = currentField < fieldCount

    override fun getString(key: String?): String = values[currentField++ / metadata.types.size] fieldValueBy key

    override fun getBoolean(key: String?): Boolean = values[currentField++ / metadata.types.size] fieldValueBy key

    override fun getInt(key: String?): Int = values[currentField++ / metadata.types.size] fieldValueBy key

    override fun getLong(key: String?): Long = values[currentField++ / metadata.types.size] fieldValueBy key

    override fun getString(index: Int): String = values[currentField++ / metadata.types.size] fieldValueBy index

    override fun getLong(index: Int): Long = values[currentField++ / metadata.types.size] fieldValueBy index

    override fun getBoolean(index: Int): Boolean = values[currentField++ / metadata.types.size] fieldValueBy index

    override fun getInt(index: Int): Int = values[currentField++ / metadata.types.size] fieldValueBy index
}

@Suppress("UNCHECKED_CAST")
infix fun <V> Any?.fieldValueBy(name: String?): V {
    val field = requireNotNull(this)
            .javaClass
            .declaredFields
            .single { it.name in requireNotNull(name) }
            .apply { isAccessible = true }
    return field[this] as V
}

@Suppress("UNCHECKED_CAST")
infix fun <V> Any?.fieldValueBy(index: Int): V {
    val field = requireNotNull(this).javaClass.declaredFields[index - 1].apply { isAccessible = true }
    return field[this] as V
}

class ResultSetMetaDataImpl(
        val types: List<Int>,
        resultSetMetaData: ResultSetMetaData
) : ResultSetMetaData by resultSetMetaData {
    override fun getColumnCount() = types.size

    override fun getColumnType(column: Int) = types.getOrElse(column - 1) { Types.NULL }
}