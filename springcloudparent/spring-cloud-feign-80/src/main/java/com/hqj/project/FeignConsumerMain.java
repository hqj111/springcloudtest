package com.hqj.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Author huangqingjia
 * @Create 2019-12-23 2:11
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeignConsumerMain {
    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerMain.class,args);
    }
}
