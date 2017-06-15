package com.vlad.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@EnableAutoConfiguration
//@ComponentScan("com.vlad.springboot")
//@SpringBootApplication(scanBasePackages={"com.vlad.springboot"})// same as @Configuration @EnableAutoConfiguration @ComponentScan

@SpringBootApplication(scanBasePackages={"com.vlad.springboot"})
public class SpringBootRestApiApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiApp.class, args);
	}

}
