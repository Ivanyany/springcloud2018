package com.ivan.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author Ivan
 * @Description 部门实体类
 * @Date 2020/3/27 9:22
 */
//@SuppressWarnings("serial")//抑制编译器产生警告信息
@AllArgsConstructor//有参构造函数
@NoArgsConstructor//无参构造函数
@Data//@Data注解在类上，会为类的所有属性自动生成setter/getter、equals、canEqual、hashCode、toString方法，如为final属性，则不会为该属性生成setter方法
//@Accessors(chain = true)//链式set方法   如果为真，产生的setter返回的this而不是void，默认是假
public class Dept implements Serializable { //Dept(Entity) orm mysql -> Dept(table) 类-表关系映射
	
	private Long 	id; // 主键
	private String 	dname; // 部门名称
	private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

	/**
	 * @Author Ivan
	 * @Description 自定义构造方法
	 * @Date 2020/3/27 9:36
	 * @Param 
	 * @return 
	 */
	public Dept(long id) {
		this.id = id;
	}
}
