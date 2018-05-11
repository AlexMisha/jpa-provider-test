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
            Account::class.java,
            mapOf("id" to 1L, "name" to "michael"),
            listOf(Types.BIGINT, Types.VARCHAR)
    )

    private val logger: Logger = Logger.getLogger(javaClass.name)

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
}