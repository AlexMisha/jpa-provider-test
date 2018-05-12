package com.shepard.jpaprovidertest.criteria

import javax.persistence.criteria.*
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

    infix fun <X : Comparable<X>> SingularAttribute<T, X>.greaterThan(expression: Expression<X>): Predicate =
            greaterThan(root[this], expression)

    infix fun <X : Comparable<X>> SingularAttribute<T, X>.greaterThan(parameter: X): Predicate =
            greaterThan(root[this], parameter)

    infix fun <X : Comparable<X>> SingularAttribute<T, X>.greaterThanOrEqualTo(expression: Expression<X>): Predicate =
            greaterThanOrEqualTo(root[this], expression)

    infix fun <X : Comparable<X>> SingularAttribute<T, X>.greaterThanOrEqualTo(parameter: X): Predicate =
            greaterThanOrEqualTo(root[this], parameter)

    infix fun <X : Comparable<X>> SingularAttribute<T, X>.lessThan(expression: Expression<X>): Predicate =
            lessThan(root[this], expression)

    infix fun <X : Comparable<X>> SingularAttribute<T, X>.lessThan(parameter: X): Predicate =
            lessThan(root[this], parameter)

    infix fun <X : Comparable<X>> SingularAttribute<T, X>.lessThanOrEqualTo(expression: Expression<X>): Predicate =
            lessThanOrEqualTo(root[this], expression)

    infix fun <X : Comparable<X>> SingularAttribute<T, X>.lessThanOrEqualTo(parameter: X): Predicate =
            lessThanOrEqualTo(root[this], parameter)
}

fun <T> CriteriaBuilder.query(clazz: Class<T>, continuation: Query<T>.() -> Unit): CriteriaQuery<T> =
        Query(createQuery(clazz), this, clazz).apply(continuation).criteriaQuery