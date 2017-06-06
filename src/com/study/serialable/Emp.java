package com.study.serialable;

import java.io.Serializable;

/**
 *  Ա����
 * @author LuHongGang
 * @date 2017��5��31��
 * @time ����8:54:52
 * @since 1.0
 *  ��ע�⣬һ����Ķ���Ҫ�����л��ɹ���������������������
	�������ʵ�� java.io.Serializable ����
	������������Ա����ǿ����л��ġ������һ�����Բ��ǿ����л��ģ�������Ա���ע���Ƕ��ݵġ�
	�������֪��һ�� Java ��׼���Ƿ��ǿ����л��ģ���鿴������ĵ�������һ�����ʵ���Ƿ������л�ʮ�ּ򵥣� ֻ��Ҫ�鿴������û��ʵ�� java.io.Serializable�ӿڡ�
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
