package com.example.k8s_consumer.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "app-properties")
data class ApplicationProperties(
    val consumerVariable: String,
    val consumerSecretVariable: String
) {
}