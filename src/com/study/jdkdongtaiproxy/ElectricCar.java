package com.study.jdkdongtaiproxy;

/**
 * 
 * @author LuHongGang
 * @date 2017��5��26��
 * @time ����11:17:10
 * @since 1.0
 *  ���ܳ���ʵ�� 2���ӿ�
 */
public class ElectricCar implements Rechargable, Vehicle {

	@Override
	public void drive() {
		System.out.println("The ElectricCar is moving ");

	}

	@Override
	public void recharge() {
		System.out.println("The ElectricCar is recharging");

	}

}
