package com.apdca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackages = "com")
@EnableJpaRepositories(basePackages = "com")
public class ApdcaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApdcaApplication.class, args);
	}

}
