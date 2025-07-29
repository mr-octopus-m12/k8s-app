package com.example.k8s_consumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class K8sConsumerApplication

fun main(args: Array<String>) {
	runApplication<K8sConsumerApplication>(*args)
}
