package com.example.k8s_producer.config

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@EnableConfigurationProperties(ConsumerProperties::class)
@Configuration
class ConsumerConfiguration(
    private val consumerProperties: ConsumerProperties
) {

    private val  logger: Logger = LoggerFactory.getLogger(ConsumerConfiguration::class.java)

    @Bean
    fun consumerRestTemplate(builder: RestTemplateBuilder): RestTemplate {
        logger.info("Consumer url is ${consumerProperties.consumerUrl}")
        return builder
            .rootUri("http://${consumerProperties.consumerUrl}")
            .build()
    }
}