package com.shepard.jpaprovidertest.tests

import com.shepard.jpaprovidertest.criteria.query
import com.shepard.jpaprovidertest.entity.Account
import com.shepard.jpaprovidertest.entity.Account_
import org.springframework.stereotype.Component
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

interface JpaTest {
    val name: String
    fun run()
}

@Component
class AccountTest : JpaTest {
    override val name: String = this.javaClass.simpleName

    @PersistenceContext
    lateinit var entityManager: EntityManager

    override fun run() {
        val query = entityManager.criteriaBuilder.query(Account::class.java) {
            where {
                Account_.name like "michael"
            }
        }
        val result = entityManager.createQuery(query).resultList
    }

}