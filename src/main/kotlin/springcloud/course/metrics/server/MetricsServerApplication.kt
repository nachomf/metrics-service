package springcloud.course.metrics.server

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableAdminServer
@SpringBootApplication
class MetricsServerApplication

fun main(args: Array<String>) {
	runApplication<MetricsServerApplication>(*args)
}
