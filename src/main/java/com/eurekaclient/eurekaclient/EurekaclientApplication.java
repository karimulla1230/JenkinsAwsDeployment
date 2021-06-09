package com.eurekaclient.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
public class EurekaclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclientApplication.class, args);
	}
	
	 @RequestMapping(value = "/eurekaClient")
	   public String home() {
	      return "Eureka Client application";
	   }

}
