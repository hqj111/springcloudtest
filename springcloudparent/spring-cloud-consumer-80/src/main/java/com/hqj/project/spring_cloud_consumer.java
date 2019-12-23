package com.hqj.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author huangqingjia
 * @Create 2019-12-22 19:46
 */
@SpringBootApplication
@EnableEurekaClient
public class spring_cloud_consumer {
    public static void main(String[] args) {
        SpringApplication.run(spring_cloud_consumer.class,args);
    }
}
