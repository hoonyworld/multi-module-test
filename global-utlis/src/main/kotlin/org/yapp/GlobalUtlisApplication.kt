package org.yapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GlobalUtlisApplication

fun main(args: Array<String>) {
	runApplication<GlobalUtlisApplication>(*args)
}
