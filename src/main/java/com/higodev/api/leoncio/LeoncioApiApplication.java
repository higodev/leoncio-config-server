package com.higodev.api.leoncio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LeoncioApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeoncioApiApplication.class, args);
	}

}
