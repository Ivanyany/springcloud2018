package com.ivan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author Ivan
 * @Description
 * @Date 2020/3/27 12:24
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumer_DashBoard_App.class, args);
	}
}
