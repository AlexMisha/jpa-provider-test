package com.shepard.jpaprovidertest.criteria

import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root

class Query<T>(
        val criteriaQuery: CriteriaQuery<T>,
        val criteriaBuilder: CriteriaBuilder,
        clazz: Class<T>
) : CriteriaQuery<T> by criteriaQuery {
    var root: Root<T> = criteriaQuery.from(clazz)

    inline fun where(predicate: CriteriaBuilder.(Root<T>) -> Predicate) {
        criteriaQuery.where(criteriaBuilder.predicate(root))
    }
}

fun <T> CriteriaBuilder.query(clazz: Class<T>, continuation: Query<T>.() -> Unit): CriteriaQuery<T> =
        Query(createQuery(clazz), this, clazz).apply(continuation).criteriaQuery