package com.study.jdkdongtaiproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * ������  JDK��̬����ʵ��
 * @author LuHongGang
 * @date 2017��5��26��
 * @time ����11:27:04
 * @since 1.0
 */
public class TestJdkDongtaiProxy {

	public static void main(String[] args) {
		
		ElectricCar car = new ElectricCar();
		// ��ȡ��Ӧ������������
		ClassLoader classLoader = car.getClass().getClassLoader();
		// ��ȡElectriCar����ʵ�ֵ����нӿ�
		Class[] carList = car.getClass().getInterfaces();
		// ����һ�����Դ��������ķ���������������,�������еĴ������ķ�������
		InvocationHandler handler = new InvocationHandlerImpl(car);
		/**
		 * ���������ṩ����Ϣ,����������� �����������,
		 * a. JDK ��ͨ�����ݴ���Ĳ�����Ϣ��̬�����ڴ��д�����.class�ļ���ͬ���ֽ���
		 * b. Ȼ��������Ӧ���ֽ���ת���ɶ�Ӧ��class
		 * c. Ȼ�����newInstance()����ʵ��
		 */
		Object o = Proxy.newProxyInstance(classLoader, carList, handler);
		
		Vehicle vehicle = (Vehicle)o;
		vehicle.drive();
		//car.drive();
	}
}
