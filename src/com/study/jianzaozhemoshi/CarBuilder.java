package com.study.jianzaozhemoshi;

import java.util.ArrayList;

/**
 *  定义 一个组装的顺序  然后提供给你 相应的模型车型
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午2:27:46
 * @since 1.0
 */
public abstract class CarBuilder {

	// 建造一个模型,给我一个组装的顺序
	public abstract void setSorts(ArrayList<String> list);
	
	// 设置完顺序后,给你提供这个模型
	public abstract CarModel getCarModel();
	
	
}
