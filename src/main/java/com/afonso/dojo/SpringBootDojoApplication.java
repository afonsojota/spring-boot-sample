package com.afonso.dojo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.afonso.dojo"})
public class SpringBootDojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDojoApplication.class, args);
	}

}
