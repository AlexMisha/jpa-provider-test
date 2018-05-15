package com.shepard.jpaprovidertest.tests

import com.shepard.jpaprovidertest.criteria.query
import com.shepard.jpaprovidertest.driver.ProviderType
import com.shepard.jpaprovidertest.driver.resultSetOf
import com.shepard.jpaprovidertest.entity.*
import org.springframework.beans.factory.annotation.Autowired
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
    override val resultSet by lazy {
        resultSetOf(
                listOf(Account(1L, "michael"), Account(2L, "john")),
                listOf(Types.BIGINT, Types.VARCHAR),
                providerType
        )
    }

    @Autowired
    lateinit var providerType: ProviderType

    private val logger: Logger = Logger.getLogger(javaClass.name)

    @PersistenceContext
    lateinit var entityManager: EntityManager

    override fun run() {
        val query = entityManager.criteriaBuilder.query(Account::class.java) {
            where {
                (Account_.id greaterThan 0L) and (Account_.id lessThan 10L)
            }
        }
        val result = entityManager.createQuery(query).resultList
        logger.info("result: $result")
    }
}

@Component
class PasswordTest : JpaTest {
    override val name: String = javaClass.name
    override val resultSet by lazy {
        resultSetOf(
                listOf(Password(1L, "asdasdskdsnadvvdfvdweefjn", Account(1L, "michael"))),
                listOf(Types.BIGINT, Types.VARCHAR, Types.REF),
                providerType,
                listOf(resultSetOf(
                        listOf(Account(1L, "michael")),
                        listOf(Types.BIGINT, Types.VARCHAR),
                        providerType,
                        inner = true
                ))
        )
    }

    @Autowired
    lateinit var providerType: ProviderType

    private val logger: Logger = Logger.getLogger(javaClass.name)

    @PersistenceContext
    lateinit var entityManager: EntityManager

    override fun run() {
        val query = entityManager.criteriaBuilder.query(Password::class.java) {
            where {
                val account = root.join(Password_.account)
                criteriaBuilder.like(account[Account_.name], "michael")
            }
        }
        val result = entityManager.createQuery(query).resultList
        logger.info("result: $result")
    }
}

@Component
class PasswordHolderTest : JpaTest {
    override val name: String = javaClass.name
    override val resultSet by lazy {
        resultSetOf(
                listOf(AccountHolder(1L, listOf(Account(1L, "michael"), Account(2L, "john")))),
                listOf(Types.BIGINT, Types.REF),
                providerType,
                innerResultSets = listOf(
                        resultSetOf(
                                listOf(Account(1L, "michael"), Account(2L, "john")),
                                listOf(Types.BIGINT, Types.VARCHAR),
                                providerType
                        )
                )
        )
    }

    @Autowired
    lateinit var providerType: ProviderType

    private val logger: Logger = Logger.getLogger(javaClass.name)

    @PersistenceContext
    lateinit var entityManager: EntityManager

    override fun run() {
        val query = entityManager.criteriaBuilder.query(AccountHolder::class.java) {
            where {
                AccountHolder_.id greaterThan 0L
            }
        }
        val result = entityManager.createQuery(query).resultList
        logger.info("result: $result")
    }

}