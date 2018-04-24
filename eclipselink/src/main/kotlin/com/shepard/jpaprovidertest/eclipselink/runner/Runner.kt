package com.shepard.jpaprovidertest.eclipselink.runner

import com.shepard.jpaprovidertest.controller.TestRunner
import com.shepard.jpaprovidertest.entity.Account
import com.shepard.jpaprovidertest.entity.Account_
import org.springframework.stereotype.Component
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Component
class EclipselinkRunner : TestRunner {
    @PersistenceContext
    lateinit var entityManager: EntityManager

    override fun run() {
        val criteriaBuilder = entityManager.criteriaBuilder
        val query = criteriaBuilder.createQuery(Account::class.java)
        val root = query.from(Account::class.java)
        query.where(criteriaBuilder.equal(root[(Account_.name)], "michael"))
        val result = entityManager.createQuery(query).resultList
    }
}