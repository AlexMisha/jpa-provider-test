package com.shepard.jpaprovidertest.driver

import java.io.InputStream
import java.io.Reader
import java.math.BigDecimal
import java.net.URL
import java.sql.*
import java.sql.Date
import java.util.*

fun callableStatementOf(preparedStatement: PreparedStatement): CallableStatement =
        CallableStatementImpl(preparedStatement)

class CallableStatementImpl(preparedStatement: PreparedStatement) : PreparedStatement by preparedStatement,
        CallableStatement {
    override fun setBlob(parameterName: String?, inputStream: InputStream?, length: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setBlob(parameterName: String?, x: Blob?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setBlob(parameterName: String?, inputStream: InputStream?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun registerOutParameter(parameterIndex: Int, sqlType: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun registerOutParameter(parameterIndex: Int, sqlType: Int, scale: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun registerOutParameter(parameterIndex: Int, sqlType: Int, typeName: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun registerOutParameter(parameterName: String?, sqlType: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun registerOutParameter(parameterName: String?, sqlType: Int, scale: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun registerOutParameter(parameterName: String?, sqlType: Int, typeName: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getNClob(parameterIndex: Int): NClob {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getNClob(parameterName: String?): NClob {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setDate(parameterName: String?, x: Date?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setDate(parameterName: String?, x: Date?, cal: Calendar?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDate(parameterIndex: Int): Date {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDate(parameterIndex: Int, cal: Calendar?): Date {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDate(parameterName: String?): Date {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDate(parameterName: String?, cal: Calendar?): Date {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setNString(parameterName: String?, value: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBoolean(parameterIndex: Int): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBoolean(parameterName: String?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @Suppress("OverridingDeprecatedMember")
    override fun getBigDecimal(parameterIndex: Int, scale: Int): BigDecimal {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBigDecimal(parameterIndex: Int): BigDecimal {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBigDecimal(parameterName: String?): BigDecimal {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setRowId(parameterName: String?, x: RowId?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTime(parameterIndex: Int): Time {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTime(parameterIndex: Int, cal: Calendar?): Time {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTime(parameterName: String?): Time {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTime(parameterName: String?, cal: Calendar?): Time {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setTime(parameterName: String?, x: Time?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setTime(parameterName: String?, x: Time?, cal: Calendar?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setInt(parameterName: String?, x: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSQLXML(parameterIndex: Int): SQLXML {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSQLXML(parameterName: String?): SQLXML {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getFloat(parameterIndex: Int): Float {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getFloat(parameterName: String?): Float {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun wasNull(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setString(parameterName: String?, x: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setAsciiStream(parameterName: String?, x: InputStream?, length: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setAsciiStream(parameterName: String?, x: InputStream?, length: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setAsciiStream(parameterName: String?, x: InputStream?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setNClob(parameterName: String?, value: NClob?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setNClob(parameterName: String?, reader: Reader?, length: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setNClob(parameterName: String?, reader: Reader?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getURL(parameterIndex: Int): URL {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getURL(parameterName: String?): URL {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setNull(parameterName: String?, sqlType: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setNull(parameterName: String?, sqlType: Int, typeName: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setShort(parameterName: String?, x: Short) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBlob(parameterIndex: Int): Blob {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBlob(parameterName: String?): Blob {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getByte(parameterIndex: Int): Byte {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getByte(parameterName: String?): Byte {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getString(parameterIndex: Int): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getString(parameterName: String?): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setBoolean(parameterName: String?, x: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setByte(parameterName: String?, x: Byte) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setCharacterStream(parameterName: String?, reader: Reader?, length: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setCharacterStream(parameterName: String?, reader: Reader?, length: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setCharacterStream(parameterName: String?, reader: Reader?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getObject(parameterIndex: Int): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getObject(parameterIndex: Int, map: MutableMap<String, Class<*>>?): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getObject(parameterName: String?): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getObject(parameterName: String?, map: MutableMap<String, Class<*>>?): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> getObject(parameterIndex: Int, type: Class<T>?): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> getObject(parameterName: String?, type: Class<T>?): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setObject(parameterName: String?, x: Any?, targetSqlType: Int, scale: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setObject(parameterName: String?, x: Any?, targetSqlType: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setObject(parameterName: String?, x: Any?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLong(parameterIndex: Int): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLong(parameterName: String?): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getClob(parameterIndex: Int): Clob {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getClob(parameterName: String?): Clob {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setBytes(parameterName: String?, x: ByteArray?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setLong(parameterName: String?, x: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setClob(parameterName: String?, reader: Reader?, length: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setClob(parameterName: String?, x: Clob?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setClob(parameterName: String?, reader: Reader?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getNString(parameterIndex: Int): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getNString(parameterName: String?): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setURL(parameterName: String?, `val`: URL?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getArray(parameterIndex: Int): java.sql.Array {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getArray(parameterName: String?): java.sql.Array {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setFloat(parameterName: String?, x: Float) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCharacterStream(parameterIndex: Int): Reader {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCharacterStream(parameterName: String?): Reader {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setBinaryStream(parameterName: String?, x: InputStream?, length: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setBinaryStream(parameterName: String?, x: InputStream?, length: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setBinaryStream(parameterName: String?, x: InputStream?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setNCharacterStream(parameterName: String?, value: Reader?, length: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setNCharacterStream(parameterName: String?, value: Reader?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getShort(parameterIndex: Int): Short {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getShort(parameterName: String?): Short {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setDouble(parameterName: String?, x: Double) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTimestamp(parameterIndex: Int): Timestamp {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTimestamp(parameterIndex: Int, cal: Calendar?): Timestamp {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTimestamp(parameterName: String?): Timestamp {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTimestamp(parameterName: String?, cal: Calendar?): Timestamp {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getRef(parameterIndex: Int): Ref {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getRef(parameterName: String?): Ref {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setSQLXML(parameterName: String?, xmlObject: SQLXML?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getNCharacterStream(parameterIndex: Int): Reader {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getNCharacterStream(parameterName: String?): Reader {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setBigDecimal(parameterName: String?, x: BigDecimal?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBytes(parameterIndex: Int): ByteArray {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getBytes(parameterName: String?): ByteArray {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDouble(parameterIndex: Int): Double {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDouble(parameterName: String?): Double {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getInt(parameterIndex: Int): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getInt(parameterName: String?): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setTimestamp(parameterName: String?, x: Timestamp?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setTimestamp(parameterName: String?, x: Timestamp?, cal: Calendar?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getRowId(parameterIndex: Int): RowId {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getRowId(parameterName: String?): RowId {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}