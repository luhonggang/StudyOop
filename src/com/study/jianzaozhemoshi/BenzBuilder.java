package com.study.jianzaozhemoshi;

import java.util.ArrayList;

/**
 *  奔驰 车型的 模型车 
 *  你只要给定我一个组装的顺序,我就可以提供给你一个奔驰车的模型
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午2:32:15
 * @since 1.0
 */
public class BenzBuilder extends CarBuilder{

	private BenzModel benz = new BenzModel();
	
	@Override
	public void setSorts(ArrayList<String> list) {
		this.benz.setSorts(list);
		
	}

	@Override
	public CarModel getCarModel() {
		return this.benz;
	}

}
