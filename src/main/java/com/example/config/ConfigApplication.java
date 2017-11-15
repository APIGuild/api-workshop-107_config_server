package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.scope.refresh.RefreshScope;
import org.springframework.cloud.endpoint.RefreshEndpoint;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class ConfigApplication {

	@Autowired
	RefreshEndpoint refreshEndpoint;

	@Autowired
	RefreshScope refreshScope;

	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}
}
