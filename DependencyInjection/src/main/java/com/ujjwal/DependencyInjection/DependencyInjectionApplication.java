package com.ujjwal.DependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
//This is the way to create Dependencyu Injection
		ApplicationContext context =  SpringApplication.run(DependencyInjectionApplication.class, args);
	Dev obj = context.getBean(Dev.class);
	obj.build();
	}

}
