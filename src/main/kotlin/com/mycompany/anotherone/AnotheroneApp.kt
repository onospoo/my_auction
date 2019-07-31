package com.mycompany.anotherone

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AnotheroneApp

fun main(args: Array<String>) {
    runApplication<AnotheroneApp>(*args)
}
