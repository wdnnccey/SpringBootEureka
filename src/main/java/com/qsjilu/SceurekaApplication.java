package com.qsjilu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//激活注册中心服务
@EnableEurekaServer
public class SceurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SceurekaApplication.class, args);
	}

}
