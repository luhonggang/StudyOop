package com.study.jianzaozhemoshi;

import java.util.ArrayList;

/**
 *  给定一个 组装的顺序,提供给你一个宝马车型的模型
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午2:36:07
 * @since 1.0
 */
public class BMWBuilder extends CarBuilder{

	private BMWModel bmw = new BMWModel();
	
	@Override
	public void setSorts(ArrayList<String> list) {
		this.bmw.setSorts(list);
		
	}

	@Override
	public CarModel getCarModel() {
		return this.bmw;
	}

}
