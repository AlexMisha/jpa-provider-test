package com.shepard.jpaprovidertest.tests

import com.shepard.jpaprovidertest.criteria.query
import com.shepard.jpaprovidertest.driver.AbstractResultSet
import com.shepard.jpaprovidertest.entity.Account
import com.shepard.jpaprovidertest.entity.Account_
import org.springframework.stereotype.Component
import java.sql.ResultSet
import java.sql.ResultSetMetaData
import java.sql.Types
import java.util.logging.Logger
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import javax.sql.rowset.RowSetMetaDataImpl

interface JpaTest {
    val name: String
    val resultSet: ResultSet
    fun run()
}

@Component
class AccountTest : JpaTest {
    override val name: String = this.javaClass.simpleName
    override val resultSet: ResultSet = AccountResultSet()

    private val logger: Logger = Logger.getLogger(this.javaClass.name)

    @PersistenceContext
    lateinit var entityManager: EntityManager

    override fun run() {
        val query = entityManager.criteriaBuilder.query(Account::class.java) {
            where {
                Account_.name like "michael"
            }
        }
        val result = entityManager.createQuery(query).singleResult
        logger.info("result: $result")
    }

    class AccountResultSet : AbstractResultSet() {
        private val logger: Logger = Logger.getLogger(this.javaClass.name)
        private var count = 2

        override fun next(): Boolean {
            count--
            logger.info("next count: $count")
            return count != 0
        }

        override fun getString(columnIndex: Int): String {
            logger.info("getString columnIndex: $columnIndex")
            return "michael"
        }

        override fun getString(columnLabel: String?): String {
            logger.info("getString columnLabel: $columnLabel")
            return "michael"
        }

        override fun getLong(columnIndex: Int): Long {
            logger.info("getLong columnIndex: $columnIndex")
            return 1L
        }

        override fun getLong(columnLabel: String?): Long {
            logger.info("getLong columnLabel: $columnLabel")
            return 1L
        }

        override fun getMetaData(): ResultSetMetaData {
            return ResultSetMetaDataImpl(RowSetMetaDataImpl())
        }
    }

    class ResultSetMetaDataImpl(resultSetMetaData: ResultSetMetaData) : ResultSetMetaData by resultSetMetaData {
        var count = 1

        override fun getColumnCount() = 2

        override fun getColumnType(column: Int) = when (count++) {
            1 -> Types.BIGINT
            2 -> Types.VARCHAR
            else -> Types.NULL
        }
    }
}