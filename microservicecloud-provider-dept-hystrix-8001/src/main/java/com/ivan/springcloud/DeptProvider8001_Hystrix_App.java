package com.ivan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @Author Ivan
 * @Description
 * @Date 2020/3/27 10:07
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
@EnableHystrix //对Hystrix容错机制的支持
public class DeptProvider8001_Hystrix_App {

	public static void main(String[] args) {
		
		SpringApplication.run(DeptProvider8001_Hystrix_App.class, args);
	}

}
