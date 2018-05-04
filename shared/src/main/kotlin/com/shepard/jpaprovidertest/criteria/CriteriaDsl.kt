package com.shepard.jpaprovidertest.criteria

import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root
import javax.persistence.metamodel.SingularAttribute

class Query<T>(
        val criteriaQuery: CriteriaQuery<T>,
        val criteriaBuilder: CriteriaBuilder,
        clazz: Class<T>
) : CriteriaQuery<T> by criteriaQuery {
    var root: Root<T> = criteriaQuery.from(clazz)

    inline fun where(predicate: WhereClause<T>.() -> Predicate) {
        criteriaQuery.where(whereClauseOf(criteriaBuilder, root).predicate())
    }
}

fun <T> whereClauseOf(criteriaBuilder: CriteriaBuilder, root: Root<T>): WhereClause<T> =
        WhereClause(criteriaBuilder, root)

class WhereClause<T>(
        private val criteriaBuilder: CriteriaBuilder,
        private val root: Root<T>
) : CriteriaBuilder by criteriaBuilder {
    infix fun SingularAttribute<T, String>.like(parameter: String): Predicate = like(root[this], parameter)

    infix fun <X> SingularAttribute<T, X>.equal(parameter: X): Predicate = equal(root[this], parameter)

    infix fun Predicate.and(predicate: Predicate): Predicate = and(this, predicate)

    infix fun Predicate.or(predicate: Predicate): Predicate = or(this, predicate)
}

fun <T> CriteriaBuilder.query(clazz: Class<T>, continuation: Query<T>.() -> Unit): CriteriaQuery<T> =
        Query(createQuery(clazz), this, clazz).apply(continuation).criteriaQuery