package taskmanager.kotlin_spring_boot_task_manager

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringBootTaskManagerApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringBootTaskManagerApplication>(*args)
}
