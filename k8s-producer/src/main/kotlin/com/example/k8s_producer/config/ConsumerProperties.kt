package com.example.k8s_producer.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "consumer-properties")
class ConsumerProperties(
    val consumerUrl: String,
) {
}