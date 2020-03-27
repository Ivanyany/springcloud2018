package com.ivan.springcloud.service.impl;

import com.ivan.springcloud.dao.DeptDao;
import com.ivan.springcloud.entities.Dept;
import com.ivan.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Ivan
 * @Description Service
 * @Date 2020/3/27 12:26
 */
@Service
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private DeptDao dao;

	@Override
	public boolean add(Dept dept) {
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Dept> list() {
		return dao.findAll();
	}

}
