package com.study.serialable;

import java.io.Serializable;

/**
 *  员工类
 * @author LuHongGang
 * @date 2017年5月31日
 * @time 下午8:54:52
 * @since 1.0
 *  请注意，一个类的对象要想序列化成功，必须满足两个条件：
	该类必须实现 java.io.Serializable 对象。
	该类的所有属性必须是可序列化的。如果有一个属性不是可序列化的，则该属性必须注明是短暂的。
	如果你想知道一个 Java 标准类是否是可序列化的，请查看该类的文档。检验一个类的实例是否能序列化十分简单， 只需要查看该类有没有实现 java.io.Serializable接口。
 */
public class Emp implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Integer id;
	public String name;
	public double sal;
	public Integer deptNo;
	
	public Emp(){
		
	}
	public Emp(Integer id, String name, double sal, Integer deptNo) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.deptNo = deptNo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	
	
}
