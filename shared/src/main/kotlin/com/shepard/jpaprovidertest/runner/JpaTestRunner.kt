package com.shepard.jpaprovidertest.runner

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
        val criteriaBuilder = entityManager.criteriaBuilder
        val query = criteriaBuilder.createQuery(Account::class.java)
        val root = query.from(Account::class.java)
        query.where(criteriaBuilder.equal(root.get(Account_.name), "michael"))
        val result = entityManager.createQuery(query).resultList
    }
}