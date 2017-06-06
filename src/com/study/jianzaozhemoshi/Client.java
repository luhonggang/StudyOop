package com.study.jianzaozhemoshi;

import java.util.ArrayList;

/**
 *  建造者 模式
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 上午10:51:56
 * @since 1.0
 */
public class Client {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
        list.add("start");
        list.add("enginBoom");
        list.add("stop");
        list.add("alarm");
		CarModel bc = new BenzModel();
		bc.setSorts(list);
		bc.run();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		/**
		 * 给定我顺序,以及模型,然后就可以造出相应的车
		 */
		// 存放run的顺序
		ArrayList<String> listSort = new ArrayList<String>();
		listSort.add("start");
		listSort.add("enginBoom");
		listSort.add("stop");
		listSort.add("alarm");
		
		// 模型 >>> 要一辆奔驰车
		CarBuilder benz = new BenzBuilder();
		
		// 要把这个run的顺序给建造类 
		benz.setSorts(listSort);
		// 开始依据顺序和模型 建造出给定的模型的车型来
		BenzModel benzModel = (BenzModel) benz.getCarModel();
		// 奔驰车跑一下看看
		benzModel.run();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		/**
		 *  这时候 我们就可以按照相应的类型 来建造不同品牌的车辆
		 */
		Director director = new Director();
		// 1w辆A类型的宝马车
		for(int i=0;i<10000;i++){
			director.getABenzModel().run();
		}
	}
}
