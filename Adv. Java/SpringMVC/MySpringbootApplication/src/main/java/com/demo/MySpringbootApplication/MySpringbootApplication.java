package com.demo.MySpringbootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MySpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(MySpringbootApplication.class, args);
	}

}
