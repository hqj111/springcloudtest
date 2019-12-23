package com.hqj.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 启用Eureka服务端功能
public class spring_cloud_eureka {
	
	public static void main(String[] args) {
		SpringApplication.run(spring_cloud_eureka.class, args);
	}

}