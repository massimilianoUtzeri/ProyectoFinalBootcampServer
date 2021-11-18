package com.proyectoFinalBootcampServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ProyectoFinalBootcampServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalBootcampServerApplication.class, args);
	}

}
