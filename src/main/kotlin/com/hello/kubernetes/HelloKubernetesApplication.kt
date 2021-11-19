package com.hello.kubernetes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloKubernetesApplication

fun main(args: Array<String>) {
	runApplication<HelloKubernetesApplication>(*args)
}
