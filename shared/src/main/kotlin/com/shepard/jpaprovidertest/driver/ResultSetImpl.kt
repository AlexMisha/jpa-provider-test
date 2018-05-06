package com.shepard.jpaprovidertest.driver

import java.io.InputStream
import java.io.Reader
import java.math.BigDecimal
import java.net.URL
import java.sql.*
import java.sql.Array
import java.sql.Date
import java.util.*
import java.util.logging.Logger

abstract class AbstractResultSet : ResultSet {
    override fun findColumn(columnLabel: String?): Int {
        logger.info("findColumn columnLabel: $columnLabel")
        return 1
    }

    override fun getNClob(columnIndex: Int): NClob {
        logger.info("getNClob")
        return nClob()
    }

    override fun getNClob(columnLabel: String?): NClob {
        logger.info("getNClob")
        return nClob()
    }

    override fun updateNString(columnIndex: Int, nString: String?) {
        logger.info("updateNString")
    }

    override fun updateNString(columnLabel: String?, nString: String?) {
        logger.info("updateNString")
    }

    override fun updateBinaryStream(columnIndex: Int, x: InputStream?, length: Int) {
        logger.info("updateBinaryStream")
    }

    override fun updateBinaryStream(columnLabel: String?, x: InputStream?, length: Int) {
        logger.info("updateBinaryStream")
    }

    override fun updateBinaryStream(columnIndex: Int, x: InputStream?, length: Long) {
        logger.info("updateBinaryStream")
    }

    override fun updateBinaryStream(columnLabel: String?, x: InputStream?, length: Long) {
        logger.info("updateBinaryStream")
    }

    override fun updateBinaryStream(columnIndex: Int, x: InputStream?) {
        logger.info("updateBinaryStream")
    }

    override fun updateBinaryStream(columnLabel: String?, x: InputStream?) {
        logger.info("updateBinaryStream")
    }

    override fun getStatement(): Statement? {
        logger.info("getStatement")
        return null
    }

    override fun updateTimestamp(columnIndex: Int, x: Timestamp?) {
        logger.info("updateTimestamp")
    }

    override fun updateTimestamp(columnLabel: String?, x: Timestamp?) {
        logger.info("updateTimestamp")
    }

    override fun updateNCharacterStream(columnIndex: Int, x: Reader?, length: Long) {
        logger.info("updateNCharacterStream")
    }

    override fun updateNCharacterStream(columnLabel: String?, reader: Reader?, length: Long) {
        logger.info("updateNCharacterStream")
    }

    override fun updateNCharacterStream(columnIndex: Int, x: Reader?) {
        logger.info("updateNCharacterStream")
    }

    override fun updateNCharacterStream(columnLabel: String?, reader: Reader?) {
        logger.info("updateNCharacterStream")
    }

    override fun updateInt(columnIndex: Int, x: Int) {
        logger.info("updateInt")
    }

    override fun updateInt(columnLabel: String?, x: Int) {
        logger.info("updateInt")
    }

    override fun moveToInsertRow() {
        logger.info("moveToInsertRow")
    }

    override fun getDate(columnIndex: Int): Date {
        logger.info("getDate")
        return Date(System.currentTimeMillis())
    }

    override fun getDate(columnLabel: String?): Date {
        logger.info("getDate")
        return Date(System.currentTimeMillis())
    }

    override fun getDate(columnIndex: Int, cal: Calendar?): Date {
        logger.info("getDate")
        return Date(System.currentTimeMillis())
    }

    override fun getDate(columnLabel: String?, cal: Calendar?): Date {
        logger.info("getDate")
        return Date(System.currentTimeMillis())
    }

    override fun getWarnings(): SQLWarning {
        logger.info("getWarnings")
        return SQLWarning()
    }

    override fun beforeFirst() {
        logger.info("beforeFirst")
    }

    override fun close() {
        logger.info("close")
    }

    override fun updateFloat(columnIndex: Int, x: Float) {
        logger.info("updateFloat")
    }

    override fun updateFloat(columnLabel: String?, x: Float) {
        logger.info("updateFloat")
    }

    override fun getBoolean(columnIndex: Int): Boolean {
        logger.info("getBoolean")
        return true
    }

    override fun getBoolean(columnLabel: String?): Boolean {
        logger.info("getBoolean")
        return true
    }

    override fun isFirst(): Boolean {
        logger.info("isFirst")
        return true
    }

    override fun getBigDecimal(columnIndex: Int, scale: Int): BigDecimal {
        logger.info("getBigDecimal")
        return BigDecimal.ONE
    }

    override fun getBigDecimal(columnLabel: String?, scale: Int): BigDecimal {
        logger.info("getBigDecimal")
        return BigDecimal.ONE
    }

    override fun getBigDecimal(columnIndex: Int): BigDecimal {
        logger.info("getBigDecimal")
        return BigDecimal.ONE
    }

    override fun getBigDecimal(columnLabel: String?): BigDecimal {
        logger.info("getBigDecimal")
        return BigDecimal.ONE
    }

    override fun updateBytes(columnIndex: Int, x: ByteArray?) {
        logger.info("updateBytes")
    }

    override fun updateBytes(columnLabel: String?, x: ByteArray?) {
        logger.info("updateBytes")
    }

    override fun isLast(): Boolean {
        logger.info("isLast")
        return false
    }

    override fun insertRow() {
        logger.info("insertRow")
    }

    override fun getTime(columnIndex: Int): Time {
        logger.info("getTime")
        return Time(System.currentTimeMillis())
    }

    override fun getTime(columnLabel: String?): Time {
        logger.info("getTime")
        return Time(System.currentTimeMillis())
    }

    override fun getTime(columnIndex: Int, cal: Calendar?): Time {
        logger.info("getTime")
        return Time(System.currentTimeMillis())
    }

    override fun getTime(columnLabel: String?, cal: Calendar?): Time {
        logger.info("getTime")
        return Time(System.currentTimeMillis())
    }

    override fun rowDeleted(): Boolean {
        logger.info("rowDeleted")
        return true
    }

    override fun last(): Boolean {
        logger.info("last")
        return false
    }

    override fun isAfterLast(): Boolean {
        logger.info("isAfterLast")
        return false
    }

    override fun relative(rows: Int): Boolean {
        logger.info("relative")
        return true
    }

    override fun absolute(row: Int): Boolean {
        logger.info("absolute")
        return false
    }

    override fun getSQLXML(columnIndex: Int): SQLXML {
        logger.info("getSQLXML")
        return sqlXml()
    }

    override fun getSQLXML(columnLabel: String?): SQLXML {
        logger.info("getSQLXML")
        return sqlXml()
    }

    override fun <T : Any?> unwrap(iface: Class<T>?): T {
        logger.info("unwrap")
        return requireNotNull(iface).newInstance()
    }

    override fun next(): Boolean {
        logger.info("next")
        return false
    }

    override fun getFloat(columnIndex: Int): Float {
        logger.info("getFloat")
        return 0f
    }

    override fun getFloat(columnLabel: String?): Float {
        logger.info("getFloat")
        return 0f
    }

    override fun wasNull(): Boolean {
        logger.info("wasNull")
        return false
    }

    override fun getRow(): Int {
        logger.info("getRow")
        return 1
    }

    override fun first(): Boolean {
        logger.info("first")
        return true
    }

    override fun updateAsciiStream(columnIndex: Int, x: InputStream?, length: Int) {
        logger.info("updateAsciiStream")
    }

    override fun updateAsciiStream(columnLabel: String?, x: InputStream?, length: Int) {
        logger.info("updateAsciiStream")
    }

    override fun updateAsciiStream(columnIndex: Int, x: InputStream?, length: Long) {
        logger.info("updateAsciiStream")
    }

    override fun updateAsciiStream(columnLabel: String?, x: InputStream?, length: Long) {
        logger.info("updateAsciiStream")
    }

    override fun updateAsciiStream(columnIndex: Int, x: InputStream?) {
        logger.info("updateAsciiStream")
    }

    override fun updateAsciiStream(columnLabel: String?, x: InputStream?) {
        logger.info("updateAsciiStream")
    }

    override fun getURL(columnIndex: Int): URL {
        logger.info("getURL")
        TODO()
    }

    override fun getURL(columnLabel: String?): URL {
        logger.info("getURL")
        TODO()
    }

    override fun updateShort(columnIndex: Int, x: Short) {
        logger.info("updateShort")
    }

    override fun updateShort(columnLabel: String?, x: Short) {
        logger.info("updateShort")
    }

    override fun getType(): Int {
        logger.info("getType")
        TODO()
    }

    override fun updateNClob(columnIndex: Int, nClob: NClob?) {
        logger.info("updateNClob")
    }

    override fun updateNClob(columnLabel: String?, nClob: NClob?) {
        logger.info("updateNClob")
    }

    override fun updateNClob(columnIndex: Int, reader: Reader?, length: Long) {
        logger.info("updateNClob")
    }

    override fun updateNClob(columnLabel: String?, reader: Reader?, length: Long) {
        logger.info("updateNClob")
    }

    override fun updateNClob(columnIndex: Int, reader: Reader?) {
        logger.info("updateNClob")
    }

    override fun updateNClob(columnLabel: String?, reader: Reader?) {
        logger.info("updateNClob")
    }

    override fun updateRef(columnIndex: Int, x: Ref?) {
        logger.info("updateRef")
    }

    override fun updateRef(columnLabel: String?, x: Ref?) {
        logger.info("updateRef")
    }

    override fun updateObject(columnIndex: Int, x: Any?, scaleOrLength: Int) {
        logger.info("updateObject")
    }

    override fun updateObject(columnIndex: Int, x: Any?) {
        logger.info("updateObject")
    }

    override fun updateObject(columnLabel: String?, x: Any?, scaleOrLength: Int) {
        logger.info("updateObject")
    }

    override fun updateObject(columnLabel: String?, x: Any?) {
        logger.info("updateObject")
    }

    override fun setFetchSize(rows: Int) {
        logger.info("setFetchSize")
    }

    override fun afterLast() {
        logger.info("afterLast")
    }

    override fun updateLong(columnIndex: Int, x: Long) {
        logger.info("updateLong")
    }

    override fun updateLong(columnLabel: String?, x: Long) {
        logger.info("updateLong")
    }

    override fun getBlob(columnIndex: Int): Blob {
        logger.info("getBlob")
        TODO()
    }

    override fun getBlob(columnLabel: String?): Blob {
        logger.info("getBlob")
        TODO()
    }

    override fun updateClob(columnIndex: Int, x: Clob?) {
        logger.info("updateClob")
    }

    override fun updateClob(columnLabel: String?, x: Clob?) {
        logger.info("updateClob")
    }

    override fun updateClob(columnIndex: Int, reader: Reader?, length: Long) {
        logger.info("updateClob")
    }

    override fun updateClob(columnLabel: String?, reader: Reader?, length: Long) {
        logger.info("updateClob")
    }

    override fun updateClob(columnIndex: Int, reader: Reader?) {
        logger.info("updateClob")
    }

    override fun updateClob(columnLabel: String?, reader: Reader?) {
        logger.info("updateClob")
    }

    override fun getByte(columnIndex: Int): Byte {
        logger.info("getByte")
        TODO()
    }

    override fun getByte(columnLabel: String?): Byte {
        logger.info("getByte")
        TODO()
    }

    override fun getString(columnIndex: Int): String {
        logger.info("getString")
        return "michael"
    }

    override fun getString(columnLabel: String?): String {
        logger.info("getString")
        return "michael"
    }

    override fun updateSQLXML(columnIndex: Int, xmlObject: SQLXML?) {
        logger.info("updateSQLXML")
    }

    override fun updateSQLXML(columnLabel: String?, xmlObject: SQLXML?) {
        logger.info("updateSQLXML")
    }

    override fun updateDate(columnIndex: Int, x: Date?) {
        logger.info("updateDate")
    }

    override fun updateDate(columnLabel: String?, x: Date?) {
        logger.info("updateDate")
    }

    override fun getHoldability(): Int {
        logger.info("getHoldability")
        return 100
    }

    override fun getObject(columnIndex: Int): Any {
        logger.info("getObject")
        TODO()
    }

    override fun getObject(columnLabel: String?): Any {
        logger.info("getObject")
        TODO()
    }

    override fun getObject(columnIndex: Int, map: MutableMap<String, Class<*>>?): Any {
        logger.info("getObject")
        TODO()
    }

    override fun getObject(columnLabel: String?, map: MutableMap<String, Class<*>>?): Any {
        logger.info("getObject")
        TODO()
    }

    override fun <T : Any?> getObject(columnIndex: Int, type: Class<T>?): T {
        logger.info("getObject")
        TODO()
    }

    override fun <T : Any?> getObject(columnLabel: String?, type: Class<T>?): T {
        logger.info("getObject")
        TODO()
    }

    override fun previous(): Boolean {
        logger.info("previous")
        return true
    }

    override fun updateDouble(columnIndex: Int, x: Double) {
        logger.info("updateDouble")
    }

    override fun updateDouble(columnLabel: String?, x: Double) {
        logger.info("updateDouble")
    }

    override fun getLong(columnIndex: Int): Long {
        logger.info("getLong")
        return 1L
    }

    override fun getLong(columnLabel: String?): Long {
        logger.info("getLong")
        return 1L
    }

    override fun getClob(columnIndex: Int): Clob {
        logger.info("getClob")
        TODO()
    }

    override fun getClob(columnLabel: String?): Clob {
        logger.info("getClob")
        TODO()
    }

    override fun updateBlob(columnIndex: Int, x: Blob?) {
        logger.info("updateBlob")
    }

    override fun updateBlob(columnLabel: String?, x: Blob?) {
        logger.info("updateBlob")
    }

    override fun updateBlob(columnIndex: Int, inputStream: InputStream?, length: Long) {
        logger.info("updateBlob")
    }

    override fun updateBlob(columnLabel: String?, inputStream: InputStream?, length: Long) {
        logger.info("updateBlob")
    }

    override fun updateBlob(columnIndex: Int, inputStream: InputStream?) {
        logger.info("updateBlob")
    }

    override fun updateBlob(columnLabel: String?, inputStream: InputStream?) {
        logger.info("updateBlob")
    }

    override fun updateByte(columnIndex: Int, x: Byte) {
        logger.info("updateByte")
    }

    override fun updateByte(columnLabel: String?, x: Byte) {
        logger.info("updateByte")
    }

    override fun updateRow() {
        logger.info("updateRow")
    }

    override fun deleteRow() {
        logger.info("deleteRow")
    }

    override fun isClosed(): Boolean {
        logger.info("isClosed")
        return false
    }

    override fun getNString(columnIndex: Int): String {
        logger.info("getNString")
        TODO()
    }

    override fun getNString(columnLabel: String?): String {
        logger.info("getNString")
        TODO()
    }

    override fun getCursorName(): String {
        logger.info("getCursorName")
        return buildString { }
    }

    override fun getArray(columnIndex: Int): Array {
        logger.info("getArray")
        return sqlArray()
    }

    override fun getArray(columnLabel: String?): Array {
        logger.info("getArray")
        return sqlArray()
    }

    override fun cancelRowUpdates() {
        logger.info("cancelRowUpdates")
    }

    override fun updateString(columnIndex: Int, x: String?) {
        logger.info("updateString")
    }

    override fun updateString(columnLabel: String?, x: String?) {
        logger.info("updateString")
    }

    override fun setFetchDirection(direction: Int) {
        logger.info("setFetchDirection")
    }

    override fun getFetchSize(): Int {
        logger.info("getFetchSize")
        return 100
    }

    override fun getCharacterStream(columnIndex: Int): Reader {
        logger.info("getCharacterStream")
        TODO()
    }

    override fun getCharacterStream(columnLabel: String?): Reader {
        logger.info("getCharacterStream")
        TODO()
    }

    override fun isBeforeFirst(): Boolean {
        logger.info("isBeforeFirst")
        return false
    }

    override fun updateBoolean(columnIndex: Int, x: Boolean) {
        logger.info("updateBoolean")
    }

    override fun updateBoolean(columnLabel: String?, x: Boolean) {
        logger.info("updateBoolean")
    }

    override fun refreshRow() {
        logger.info("refreshRow")
    }

    override fun rowUpdated(): Boolean {
        logger.info("rowUpdated")
        return true
    }

    override fun updateBigDecimal(columnIndex: Int, x: BigDecimal?) {
        logger.info("updateBigDecimal")
    }

    override fun updateBigDecimal(columnLabel: String?, x: BigDecimal?) {
        logger.info("updateBigDecimal")
    }

    override fun getShort(columnIndex: Int): Short {
        logger.info("getShort")
        TODO()
    }

    override fun getShort(columnLabel: String?): Short {
        logger.info("getShort")
        TODO()
    }

    override fun getAsciiStream(columnIndex: Int): InputStream {
        logger.info("getAsciiStream")
        TODO()
    }

    override fun getAsciiStream(columnLabel: String?): InputStream {
        logger.info("getAsciiStream")
        TODO()
    }

    override fun updateTime(columnIndex: Int, x: Time?) {
        logger.info("updateTime")
    }

    override fun updateTime(columnLabel: String?, x: Time?) {
        logger.info("updateTime")
    }

    override fun getTimestamp(columnIndex: Int): Timestamp {
        logger.info("getTimestamp")
        TODO()
    }

    override fun getTimestamp(columnLabel: String?): Timestamp {
        logger.info("getTimestamp")
        TODO()
    }

    override fun getTimestamp(columnIndex: Int, cal: Calendar?): Timestamp {
        logger.info("getTimestamp")
        TODO()
    }

    override fun getTimestamp(columnLabel: String?, cal: Calendar?): Timestamp {
        logger.info("getTimestamp")
        TODO()
    }

    override fun getRef(columnIndex: Int): Ref {
        logger.info("getRef")
        TODO()
    }

    override fun getRef(columnLabel: String?): Ref {
        logger.info("getRef")
        TODO()
    }

    override fun moveToCurrentRow() {
        logger.info("moveToCurrentRow")
    }

    override fun getConcurrency(): Int {
        logger.info("getConcurrency")
        return 1
    }

    override fun updateRowId(columnIndex: Int, x: RowId?) {
        logger.info("updateRowId")
    }

    override fun updateRowId(columnLabel: String?, x: RowId?) {
        logger.info("updateRowId")
    }

    override fun getNCharacterStream(columnIndex: Int): Reader {
        logger.info("getNCharacterStream")
        TODO()
    }

    override fun getNCharacterStream(columnLabel: String?): Reader {
        logger.info("getNCharacterStream")
        TODO()
    }

    override fun updateArray(columnIndex: Int, x: Array?) {
        logger.info("updateArray")
    }

    override fun updateArray(columnLabel: String?, x: Array?) {
        logger.info("updateArray")
    }

    override fun getBytes(columnIndex: Int): ByteArray {
        logger.info("getBytes")
        TODO()
    }

    override fun getBytes(columnLabel: String?): ByteArray {
        logger.info("getBytes")
        TODO()
    }

    override fun getDouble(columnIndex: Int): Double {
        logger.info("getDouble")
        TODO()
    }

    override fun getDouble(columnLabel: String?): Double {
        logger.info("getDouble")
        TODO()
    }

    override fun getUnicodeStream(columnIndex: Int): InputStream {
        logger.info("getUnicodeStream")
        TODO()
    }

    override fun getUnicodeStream(columnLabel: String?): InputStream {
        logger.info("getUnicodeStream")
        TODO()
    }

    override fun rowInserted(): Boolean {
        logger.info("rowInserted")
        return true
    }

    override fun isWrapperFor(iface: Class<*>?): Boolean {
        logger.info("isWrapperFor")
        return false
    }

    override fun getInt(columnIndex: Int): Int {
        logger.info("getInt")
        TODO()
    }

    override fun getInt(columnLabel: String?): Int {
        logger.info("getInt")
        TODO()
    }

    override fun updateNull(columnIndex: Int) {
        logger.info("updateNull")
    }

    override fun updateNull(columnLabel: String?) {
        logger.info("updateNull")
    }

    override fun getRowId(columnIndex: Int): RowId {
        logger.info("getRowId")
        TODO()
    }

    override fun getRowId(columnLabel: String?): RowId {
        logger.info("getRowId")
        TODO()
    }

    override fun clearWarnings() {
        logger.info("clearWarnings")
    }

    override fun getMetaData(): ResultSetMetaData {
        logger.info("getMetaData")
        TODO()
    }

    override fun getBinaryStream(columnIndex: Int): InputStream {
        logger.info("getBinaryStream")
        TODO()
    }

    override fun getBinaryStream(columnLabel: String?): InputStream {
        logger.info("getBinaryStream")
        TODO()
    }

    override fun updateCharacterStream(columnIndex: Int, x: Reader?, length: Int) {
        logger.info("updateCharacterStream")
    }

    override fun updateCharacterStream(columnLabel: String?, reader: Reader?, length: Int) {
        logger.info("updateCharacterStream")
    }

    override fun updateCharacterStream(columnIndex: Int, x: Reader?, length: Long) {
        logger.info("updateCharacterStream")
    }

    override fun updateCharacterStream(columnLabel: String?, reader: Reader?, length: Long) {
        logger.info("updateCharacterStream")
    }

    override fun updateCharacterStream(columnIndex: Int, x: Reader?) {
        logger.info("updateCharacterStream")
    }

    override fun updateCharacterStream(columnLabel: String?, reader: Reader?) {
        logger.info("updateCharacterStream")
    }

    override fun getFetchDirection(): Int {
        logger.info("getFetchDirection")
        return 1
    }

    private val logger: Logger = Logger.getLogger(this.javaClass.name)
}