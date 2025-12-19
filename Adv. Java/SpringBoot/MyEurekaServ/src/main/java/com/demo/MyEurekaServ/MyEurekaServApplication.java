package com.demo.MyEurekaServ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyEurekaServApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyEurekaServApplication.class, args);
	}

}
