package com.study.jdkdongtaiproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 测试类  JDK动态代理实现
 * @author LuHongGang
 * @date 2017年5月26日
 * @time 上午11:27:04
 * @since 1.0
 */
public class TestJdkDongtaiProxy {

	public static void main(String[] args) {
		
		ElectricCar car = new ElectricCar();
		// 获取对应的类的类加载器
		ClassLoader classLoader = car.getClass().getClassLoader();
		// 获取ElectriCar类所实现的所有接口
		Class[] carList = car.getClass().getInterfaces();
		// 设置一个来自代理传过来的方法调用请求处理器,处理所有的代理对象的方法调用
		InvocationHandler handler = new InvocationHandlerImpl(car);
		/**
		 * 依据上面提供的信息,创建代理对象 在这个过程中,
		 * a. JDK 会通过根据传入的参数信息动态地在内存中创建和.class文件等同的字节码
		 * b. 然后依据相应的字节码转换成对应的class
		 * c. 然后调用newInstance()创建实例
		 */
		Object o = Proxy.newProxyInstance(classLoader, carList, handler);
		
		Vehicle vehicle = (Vehicle)o;
		vehicle.drive();
		//car.drive();
	}
}
