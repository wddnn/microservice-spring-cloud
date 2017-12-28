package com.example.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;






/**
 * Hello world!
 *@EnableAutoConfiguration
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

	public static void main(String[] args) {
		System.out.println("aaaaaaaaaaaaaaa");
		SpringApplication.run(EurekaApplication.class, args);
		
	}
}
