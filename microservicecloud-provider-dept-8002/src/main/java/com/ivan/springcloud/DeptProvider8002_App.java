package com.ivan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author Ivan
 * @Description
 * @Date 2020/3/27 10:01
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
public class DeptProvider8002_App {

	public static void main(String[] args) {
		
		SpringApplication.run(DeptProvider8002_App.class, args);
	}

}
