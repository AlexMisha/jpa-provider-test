package com.shepard.jpaprovidertest.runner

import com.shepard.jpaprovidertest.criteria.query
import com.shepard.jpaprovidertest.entity.Account
import com.shepard.jpaprovidertest.entity.Account_
import org.springframework.stereotype.Component
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

interface TestRunner {
    fun run()
}

@Component
class JpaTestRunner : TestRunner {
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
