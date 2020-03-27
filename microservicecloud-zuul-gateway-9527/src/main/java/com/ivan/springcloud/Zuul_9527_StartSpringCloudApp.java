package com.ivan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author Ivan
 * @Description
 * @Date 2020/3/27 10:10
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_StartSpringCloudApp
{
	public static void main(String[] args)
	{
		SpringApplication.run(Zuul_9527_StartSpringCloudApp.class, args);
	}
}
