package com.springchallenges;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@SpringBootConfiguration(proxyBeanMethods = false)
public class SpringChallengesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringChallengesApplication.class, args);
	}

}
