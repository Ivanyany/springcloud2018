package com.ivan.springcloud.service;


import com.ivan.springcloud.entities.Dept;

import java.util.List;


/**
 * @Author Ivan
 * @Description Service
 * @Date 2020/3/27 12:26
 */
public interface DeptService {
	
public boolean add(Dept dept);
	
	public Dept get(Long id);
	
	public List<Dept> list();

}
