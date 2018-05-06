package com.shepard.jpaprovidertest.driver

import org.springframework.beans.factory.getBean
import org.springframework.context.ApplicationContext
import java.sql.Connection
import java.sql.Driver
import java.sql.DriverPropertyInfo
import java.util.*
import java.util.logging.Logger

fun jdbcDriverOf(applicationContext: ApplicationContext): Driver = JdbcDriver(applicationContext)

class JdbcDriver(private val applicationContext: ApplicationContext) : Driver {
    private val connection: Connection by lazy { applicationContext.getBean<Connection>() }
    private val logger: Logger = Logger.getLogger(this.javaClass.name)

    override fun getMinorVersion() = 0

    override fun getParentLogger(): Logger = logger

    override fun getPropertyInfo(url: String?, info: Properties?): Array<DriverPropertyInfo> {
        logger.info("getPropertyInfo url: $url, info: $info")
        return emptyArray()
    }

    override fun jdbcCompliant(): Boolean {
        logger.info("jdbcCompliant")
        return true
    }

    override fun acceptsURL(url: String?): Boolean {
        logger.info("acceptsURL $url")
        return true
    }

    override fun connect(url: String?, info: Properties?): Connection {
        logger.info("connect url: $url, info: $info")
        return connection
    }

    override fun getMajorVersion() = 1
}