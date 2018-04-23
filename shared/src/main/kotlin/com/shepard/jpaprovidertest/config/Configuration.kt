package com.shepard.jpaprovidertest.config

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration

@Configuration
@EntityScan(basePackages = ["com.shepard.jpaprovidertest.entity"])
class Configuration