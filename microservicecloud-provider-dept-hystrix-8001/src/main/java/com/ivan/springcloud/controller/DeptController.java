package com.ivan.springcloud.controller;

import com.ivan.springcloud.entities.Dept;
import com.ivan.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Ivan
 * @Description controller
 * @Date 2020/3/27 10:08
 */
@RestController
public class DeptController
{
	@Autowired
	private DeptService service = null;
	
//	@Autowired
//	private DiscoveryClient client;
//
//	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
//	public boolean add(@RequestBody Dept dept)
//	{
//		return service.add(dept);
//	}

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	//一旦调用服务方法失败并且抛出错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod，调用类中指定的方法
	@HystrixCommand(fallbackMethod = "processHystrix_GET")
	public Dept get(@PathVariable("id") Long id)
	{
		//return service.get(id);
		Dept dept = this.service.get(id);
		if(null==dept) {
			throw new RuntimeException("该ID："+id+"没有对应的信息");
		}
		return dept;
	}
	
	public Dept processHystrix_GET(@PathVariable("id") Long id)
	{
		Dept dept = new Dept(id);
		dept.setDname("该ID："+id+"没有对应的信息，,null----@HystrixCommand");
		dept.setDb_source("no this database in MYSQL");
		return dept;
	}

//	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
//	public List<Dept> list()
//	{
//		return service.list();
//	}
//	
//	@RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
//	public Object discovery()
//	{
//		List<String> list = client.getServices();
//		System.out.println("**********" + list);
//
//		List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
//		for (ServiceInstance element : srvList) {
//			System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
//					+ element.getUri());
//		}
//		return this.client;
//	}
}