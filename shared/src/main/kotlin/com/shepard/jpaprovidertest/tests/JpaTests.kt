package com.shepard.jpaprovidertest.tests

import com.shepard.jpaprovidertest.criteria.query
import com.shepard.jpaprovidertest.driver.resultSetOf
import com.shepard.jpaprovidertest.entity.Account
import com.shepard.jpaprovidertest.entity.Account_
import org.springframework.stereotype.Component
import java.sql.ResultSet
import java.sql.Types
import java.util.logging.Logger
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

interface JpaTest {
    val name: String
    val resultSet: ResultSet
    fun run()
}

@Component
class AccountTest : JpaTest {
    override val name: String = javaClass.simpleName
    override val resultSet = resultSetOf(
            listOf(Account(1L, "michael"), Account(2L, "john")),
            listOf(Types.BIGINT, Types.VARCHAR)
    )

    private val logger: Logger = Logger.getLogger(javaClass.name)

    @PersistenceContext
    lateinit var entityManager: EntityManager

    override fun run() {
        val query = entityManager.criteriaBuilder.query(Account::class.java) {
            where {
                criteriaBuilder.greaterThan(root[Account_.id], 0L)
            }
        }
        val result = entityManager.createQuery(query).resultList
        logger.info("result: $result")
    }
}