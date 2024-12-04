package com.mono.repo.monodemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MonodemoApplication

fun main(args: Array<String>) {
	runApplication<MonodemoApplication>(*args)
}
