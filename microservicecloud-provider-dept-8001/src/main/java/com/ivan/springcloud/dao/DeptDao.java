package com.ivan.springcloud.dao;

import com.ivan.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author Ivan
 * @Description 部门dao
 * @Date 2020/3/27 9:55
 */
@Mapper
public interface DeptDao {

	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
