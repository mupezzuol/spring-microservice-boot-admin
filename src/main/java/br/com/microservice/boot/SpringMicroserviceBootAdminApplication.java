package br.com.microservice.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAutoConfiguration
@EnableAdminServer
public class SpringMicroserviceBootAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroserviceBootAdminApplication.class, args);
	}

}
