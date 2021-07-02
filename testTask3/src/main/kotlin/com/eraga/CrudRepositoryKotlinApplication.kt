package com.eraga

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CrudRepositoryKotlinApplication

fun main(args: Array<String>) {
	runApplication<CrudRepositoryKotlinApplication>(*args)
}
