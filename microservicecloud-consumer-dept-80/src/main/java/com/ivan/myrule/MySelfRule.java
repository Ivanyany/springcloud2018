package com.ivan.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

/**
 * @Author Ivan
 * @Description 自定义规则
 * @Date 2020/3/27 9:40
 */
@Configuration
public class MySelfRule
{
	@Bean
	public IRule myRule()
	{
		
		//return new RoundRobinRule();// Ribbon默认是轮询
		
		//return new RandomRule();// 自定义为随机
		
		return new RandomRule_YXF();// 我自定义为每台机器5次
	}
}
