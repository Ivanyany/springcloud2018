package com.ivan.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;

/**
 * @Author Ivan
 * @Description 配置我的规则
 * @Date 2020/3/27 9:44
 */
@Configuration
public class ConfigBean //boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml
{ 
	@Bean
	@LoadBalanced//Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
	
	@Bean
	public IRule myRule()
	{
		//return new RoundRobinRule();//目的：默认的轮询算法。
		//return new RandomRule();//目的：用我们重新选择的随机算法替代默认的轮询。
		return new RetryRule();//目的：若某个微服务宕机，经过几次失败后不再访问它。
	}
}

//@Bean
//public UserServcie getUserServcie()
//{
//	return new UserServcieImpl();
//}
// 等价于 applicationContext.xml == ConfigBean(@Configuration)
//<bean id="userServcie" class="com.ivan.tmall.UserServiceImpl">
