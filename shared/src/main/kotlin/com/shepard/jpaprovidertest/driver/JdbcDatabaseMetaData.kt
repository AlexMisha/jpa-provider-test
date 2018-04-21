package com.shepard.jpaprovidertest.driver

import com.sun.rowset.JdbcRowSetImpl
import java.sql.Connection
import java.sql.DatabaseMetaData
import java.sql.ResultSet
import java.sql.RowIdLifetime

fun jdbcMetadata(): DatabaseMetaData = JdbcDatabaseMetaData()

class JdbcDatabaseMetaData : DatabaseMetaData {
    override fun supportsSubqueriesInQuantifieds(): Boolean {
        return true
    }

    override fun supportsGetGeneratedKeys(): Boolean {
        return true
    }

    override fun supportsCoreSQLGrammar(): Boolean {
        return true
    }

    override fun getMaxColumnsInIndex(): Int {
        return 100
    }

    override fun insertsAreDetected(type: Int): Boolean {
        return true
    }

    override fun supportsIntegrityEnhancementFacility(): Boolean {
        return true
    }

    override fun getConnection(): Connection {
        return jdbcConnection()
    }

    override fun getAttributes(catalog: String?, schemaPattern: String?, typeNamePattern: String?, attributeNamePattern: String?): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun getDatabaseProductVersion(): String {
        return buildString { }
    }

    override fun supportsOpenStatementsAcrossRollback(): Boolean {
        return true
    }

    override fun getDatabaseProductName(): String {
        return buildString { }
    }

    override fun getMaxProcedureNameLength(): Int {
        return 100
    }

    override fun getCatalogTerm(): String {
        return buildString { }
    }

    override fun supportsCatalogsInDataManipulation(): Boolean {
        return true
    }

    override fun getMaxUserNameLength(): Int {
        return 100
    }

    override fun getJDBCMajorVersion(): Int {
        return 1
    }

    override fun getTimeDateFunctions(): String {
        return buildString { }
    }

    override fun supportsStoredFunctionsUsingCallSyntax(): Boolean {
        return true
    }

    override fun autoCommitFailureClosesAllResultSets(): Boolean {
        return true
    }

    override fun getMaxColumnsInSelect(): Int {
        return 10
    }

    override fun getCatalogs(): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun storesLowerCaseQuotedIdentifiers(): Boolean {
        return true
    }

    override fun supportsDataDefinitionAndDataManipulationTransactions(): Boolean {
        return true
    }

    override fun supportsCatalogsInTableDefinitions(): Boolean {
        return true
    }

    override fun getMaxColumnsInOrderBy(): Int {
        return 10
    }

    override fun getDriverMinorVersion(): Int {
        return 0
    }

    override fun storesUpperCaseIdentifiers(): Boolean {
        return true
    }

    override fun nullsAreSortedLow(): Boolean {
        return true
    }

    override fun supportsSchemasInIndexDefinitions(): Boolean {
        return true
    }

    override fun getMaxStatementLength(): Int {
        return 100
    }

    override fun supportsTransactions(): Boolean {
        return true
    }

    override fun supportsResultSetConcurrency(type: Int, concurrency: Int): Boolean {
        return true
    }

    override fun isReadOnly(): Boolean {
        return false
    }

    override fun usesLocalFiles(): Boolean {
        return false
    }

    override fun supportsResultSetType(type: Int): Boolean {
        return false
    }

    override fun getMaxConnections(): Int {
        return 1
    }

    override fun getTables(catalog: String?, schemaPattern: String?, tableNamePattern: String?, types: Array<out String>?): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun supportsMultipleResultSets(): Boolean {
        return false
    }

    override fun dataDefinitionIgnoredInTransactions(): Boolean {
        return true
    }

    override fun getFunctions(catalog: String?, schemaPattern: String?, functionNamePattern: String?): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun getSearchStringEscape(): String {
        return buildString { }
    }

    override fun supportsGroupBy(): Boolean {
        return false
    }

    override fun getMaxTableNameLength(): Int {
        return 100
    }

    override fun dataDefinitionCausesTransactionCommit(): Boolean {
        return true
    }

    override fun supportsOpenStatementsAcrossCommit(): Boolean {
        return false
    }

    override fun ownInsertsAreVisible(type: Int): Boolean {
        return true
    }

    override fun getSchemaTerm(): String {
        return buildString { }
    }

    override fun isCatalogAtStart(): Boolean {
        return true
    }

    override fun getFunctionColumns(catalog: String?, schemaPattern: String?, functionNamePattern: String?, columnNamePattern: String?): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun supportsTransactionIsolationLevel(level: Int): Boolean {
        return false
    }

    override fun nullsAreSortedAtStart(): Boolean {
        return false
    }

    override fun getPrimaryKeys(catalog: String?, schema: String?, table: String?): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun getProcedureTerm(): String {
        return buildString { }
    }

    override fun supportsANSI92IntermediateSQL(): Boolean {
        return false
    }

    override fun getDatabaseMajorVersion(): Int {
        return 9
    }

    override fun supportsOuterJoins(): Boolean {
        return true
    }

    override fun <T : Any?> unwrap(iface: Class<T>?): T {
        return requireNotNull(iface).newInstance()
    }

    override fun supportsLikeEscapeClause(): Boolean {
        return true
    }

    override fun supportsPositionedUpdate(): Boolean {
        return true
    }

    override fun supportsMixedCaseIdentifiers(): Boolean {
        return true
    }

    override fun supportsLimitedOuterJoins(): Boolean {
        return true
    }

    override fun getSQLStateType(): Int {
        return 1
    }

    override fun getSystemFunctions(): String {
        return buildString { }
    }

    override fun getMaxRowSize(): Int {
        return 100
    }

    override fun supportsOpenCursorsAcrossRollback(): Boolean {
        return true
    }

    override fun getTableTypes(): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun getMaxTablesInSelect(): Int {
        return 100
    }

    override fun nullsAreSortedHigh(): Boolean {
        return false
    }

    override fun getURL(): String {
        return buildString { }
    }

    override fun supportsNamedParameters(): Boolean {
        return true
    }

    override fun supportsConvert(): Boolean {
        return true
    }

    override fun supportsConvert(fromType: Int, toType: Int): Boolean {
        return true
    }

    override fun getMaxStatements(): Int {
        return 10
    }

    override fun getProcedureColumns(catalog: String?, schemaPattern: String?, procedureNamePattern: String?, columnNamePattern: String?): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun allTablesAreSelectable(): Boolean {
        return true
    }

    override fun getJDBCMinorVersion(): Int {
        return 0
    }

    override fun getCatalogSeparator(): String {
        return buildString { }
    }

    override fun getSuperTypes(catalog: String?, schemaPattern: String?, typeNamePattern: String?): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun getMaxBinaryLiteralLength(): Int {
        return 100
    }

    override fun getTypeInfo(): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun getVersionColumns(catalog: String?, schema: String?, table: String?): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun supportsMultipleOpenResults(): Boolean {
        return true
    }

    override fun deletesAreDetected(type: Int): Boolean {
        return true
    }

    override fun getDatabaseMinorVersion(): Int {
        return 4
    }

    override fun supportsMinimumSQLGrammar(): Boolean {
        return true
    }

    override fun getMaxColumnsInGroupBy(): Int {
        return 100
    }

    override fun getNumericFunctions(): String {
        return buildString { }
    }

    override fun getExtraNameCharacters(): String {
        return buildString { }
    }

    override fun getMaxCursorNameLength(): Int {
        return 100
    }

    override fun nullsAreSortedAtEnd(): Boolean {
        return true
    }

    override fun supportsSchemasInDataManipulation(): Boolean {
        return true
    }

    override fun getSchemas(): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun getSchemas(catalog: String?, schemaPattern: String?): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun supportsCorrelatedSubqueries(): Boolean {
        return true
    }

    override fun getDefaultTransactionIsolation(): Int {
        return 1
    }

    override fun locatorsUpdateCopy(): Boolean {
        return true
    }

    override fun getColumns(catalog: String?, schemaPattern: String?, tableNamePattern: String?, columnNamePattern: String?): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun getCrossReference(parentCatalog: String?, parentSchema: String?, parentTable: String?, foreignCatalog: String?, foreignSchema: String?, foreignTable: String?): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun ownDeletesAreVisible(type: Int): Boolean {
        return true
    }

    override fun othersUpdatesAreVisible(type: Int): Boolean {
        return true
    }

    override fun supportsStatementPooling(): Boolean {
        return true
    }

    override fun storesLowerCaseIdentifiers(): Boolean {
        return true
    }

    override fun supportsCatalogsInIndexDefinitions(): Boolean {
        return true
    }

    override fun ownUpdatesAreVisible(type: Int): Boolean {
        return true
    }

    override fun getUDTs(catalog: String?, schemaPattern: String?, typeNamePattern: String?, types: IntArray?): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun getStringFunctions(): String {
        return buildString { }
    }

    override fun getMaxColumnsInTable(): Int {
        return 100
    }

    override fun supportsColumnAliasing(): Boolean {
        return true
    }

    override fun supportsSchemasInProcedureCalls(): Boolean {
        return true
    }

    override fun getClientInfoProperties(): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun usesLocalFilePerTable(): Boolean {
        return false
    }

    override fun getIdentifierQuoteString(): String {
        return buildString { }
    }

    override fun supportsFullOuterJoins(): Boolean {
        return true
    }

    override fun supportsOrderByUnrelated(): Boolean {
        return true
    }

    override fun supportsSchemasInTableDefinitions(): Boolean {
        return true
    }

    override fun supportsCatalogsInProcedureCalls(): Boolean {
        return true
    }

    override fun getUserName(): String {
        return buildString { }
    }

    override fun getBestRowIdentifier(catalog: String?, schema: String?, table: String?, scope: Int, nullable: Boolean): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun supportsTableCorrelationNames(): Boolean {
        return true
    }

    override fun getMaxIndexLength(): Int {
        return 100
    }

    override fun supportsSubqueriesInExists(): Boolean {
        return true
    }

    override fun getMaxSchemaNameLength(): Int {
        return 100
    }

    override fun supportsANSI92EntryLevelSQL(): Boolean {
        return true
    }

    override fun getDriverVersion(): String {
        return buildString { }
    }

    override fun getPseudoColumns(catalog: String?, schemaPattern: String?, tableNamePattern: String?, columnNamePattern: String?): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun supportsMixedCaseQuotedIdentifiers(): Boolean {
        return true
    }

    override fun getProcedures(catalog: String?, schemaPattern: String?, procedureNamePattern: String?): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun getDriverMajorVersion(): Int {
        return 0
    }

    override fun supportsANSI92FullSQL(): Boolean {
        return true
    }

    override fun supportsAlterTableWithAddColumn(): Boolean {
        return true
    }

    override fun supportsResultSetHoldability(holdability: Int): Boolean {
        return true
    }

    override fun getColumnPrivileges(catalog: String?, schema: String?, table: String?, columnNamePattern: String?): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun getImportedKeys(catalog: String?, schema: String?, table: String?): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun supportsUnionAll(): Boolean {
        return true
    }

    override fun getRowIdLifetime(): RowIdLifetime {
        return RowIdLifetime.ROWID_UNSUPPORTED
    }

    override fun getDriverName(): String {
        return "JdbcDriver"
    }

    override fun doesMaxRowSizeIncludeBlobs(): Boolean {
        return true
    }

    override fun supportsGroupByUnrelated(): Boolean {
        return true
    }

    override fun getIndexInfo(catalog: String?, schema: String?, table: String?, unique: Boolean, approximate: Boolean): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun supportsSubqueriesInIns(): Boolean {
        return true
    }

    override fun supportsStoredProcedures(): Boolean {
        return true
    }

    override fun getExportedKeys(catalog: String?, schema: String?, table: String?): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun supportsPositionedDelete(): Boolean {
        return true
    }

    override fun supportsAlterTableWithDropColumn(): Boolean {
        return true
    }

    override fun supportsExpressionsInOrderBy(): Boolean {
        return true
    }

    override fun getMaxCatalogNameLength(): Int {
        return 100
    }

    override fun supportsExtendedSQLGrammar(): Boolean {
        return true
    }

    override fun othersInsertsAreVisible(type: Int): Boolean {
        return true
    }

    override fun updatesAreDetected(type: Int): Boolean {
        return true
    }

    override fun supportsDataManipulationTransactionsOnly(): Boolean {
        return true
    }

    override fun supportsSubqueriesInComparisons(): Boolean {
        return true
    }

    override fun supportsSavepoints(): Boolean {
        return true
    }

    override fun getSQLKeywords(): String {
        return buildString { }
    }

    override fun getMaxColumnNameLength(): Int {
        return 100
    }

    override fun nullPlusNonNullIsNull(): Boolean {
        return true
    }

    override fun supportsGroupByBeyondSelect(): Boolean {
        return true
    }

    override fun supportsCatalogsInPrivilegeDefinitions(): Boolean {
        return true
    }

    override fun allProceduresAreCallable(): Boolean {
        return false
    }

    override fun getSuperTables(catalog: String?, schemaPattern: String?, tableNamePattern: String?): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun generatedKeyAlwaysReturned(): Boolean {
        return false
    }

    override fun isWrapperFor(iface: Class<*>?): Boolean {
        return false
    }

    override fun storesUpperCaseQuotedIdentifiers(): Boolean {
        return true
    }

    override fun getMaxCharLiteralLength(): Int {
        return 100
    }

    override fun othersDeletesAreVisible(type: Int): Boolean {
        return true
    }

    override fun supportsNonNullableColumns(): Boolean {
        return true
    }

    override fun supportsUnion(): Boolean {
        return true
    }

    override fun supportsDifferentTableCorrelationNames(): Boolean {
        return true
    }

    override fun supportsSchemasInPrivilegeDefinitions(): Boolean {
        return true
    }

    override fun supportsSelectForUpdate(): Boolean {
        return true
    }

    override fun supportsMultipleTransactions(): Boolean {
        return true
    }

    override fun storesMixedCaseQuotedIdentifiers(): Boolean {
        return true
    }

    override fun supportsOpenCursorsAcrossCommit(): Boolean {
        return true
    }

    override fun storesMixedCaseIdentifiers(): Boolean {
        return true
    }

    override fun getTablePrivileges(catalog: String?, schemaPattern: String?, tableNamePattern: String?): ResultSet {
        return JdbcRowSetImpl()
    }

    override fun supportsBatchUpdates(): Boolean {
        return true
    }

    override fun getResultSetHoldability(): Int {
        return 1
    }

}