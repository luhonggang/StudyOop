package com.study.jdkdongtaiproxy;

/**
 * 
 * @author LuHongGang
 * @date 2017年5月26日
 * @time 上午11:17:10
 * @since 1.0
 *  电能车类实现 2个接口
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
