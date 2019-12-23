package com.hqj.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //开启网关
public class spring_cloud_zuul_9002 {
	
	public static void main(String[] args) {
		SpringApplication.run(spring_cloud_zuul_9002.class, args);
	}

}