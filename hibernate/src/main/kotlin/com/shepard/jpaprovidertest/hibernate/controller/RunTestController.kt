package com.shepard.jpaprovidertest.hibernate.controller

import com.google.gson.Gson
import com.shepard.jpaprovidertest.entity.Account
import com.shepard.jpaprovidertest.entity.Account_
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@RestController
class RunTestController {
    @PersistenceContext
    lateinit var entityManager: EntityManager

    @RequestMapping("/hibernate")
    fun hibernate(): ModelAndView {
        val criteriaBuilder = entityManager.criteriaBuilder
        val query = criteriaBuilder.createQuery(Account::class.java)
        val root = query.from(Account::class.java)
        query.where(criteriaBuilder.equal(root[(Account_.name)], "michael"))
        val result = entityManager.createQuery(query).resultList

        return ModelAndView().apply { addObject(Gson().toJson(result)) }
    }
}