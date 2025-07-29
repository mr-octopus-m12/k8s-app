package com.example.k8s_producer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class K8sProducerApplication

fun main(args: Array<String>) {
	runApplication<K8sProducerApplication>(*args)
}
