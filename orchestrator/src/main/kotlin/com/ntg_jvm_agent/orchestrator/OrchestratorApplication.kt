package com.ntg_jvm_agent.orchestrator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OrchestratorApplication

fun main(args: Array<String>) {
	runApplication<OrchestratorApplication>(*args)
}
