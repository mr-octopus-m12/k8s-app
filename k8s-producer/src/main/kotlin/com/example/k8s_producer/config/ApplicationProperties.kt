package com.example.k8s_producer.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "app-properties")
data class ApplicationProperties(
    val producerVariable: String,
    val producerSecretVariable: String
) {
}