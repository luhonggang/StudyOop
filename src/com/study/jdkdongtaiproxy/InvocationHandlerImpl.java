package com.study.jdkdongtaiproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 
 * @author LuHongGang
 * @date 2017年5月26日
 * @time 上午11:22:14
 * @since 1.0
 */
public class InvocationHandlerImpl implements InvocationHandler{

	private ElectricCar car;
	
	public  InvocationHandlerImpl(ElectricCar car) {
		this.car = car;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("Object>>>>:"+proxy.getClass());
		System.out.println("You are going to invoke "+method.getName());
		method.invoke(car, null);
		System.out.println(method.getName()+"Invocation has been finished ");
		return null;
	}

}
