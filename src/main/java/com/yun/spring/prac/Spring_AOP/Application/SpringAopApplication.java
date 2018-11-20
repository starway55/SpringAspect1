package com.yun.spring.prac.Spring_AOP.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAopApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringAopApplication.class, args);

		DatabaseManager databaseManager = applicationContext.getBean(DatabaseManager.class);

		databaseManager.showAllThings();

	}
}
