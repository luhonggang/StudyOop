package com.study.jianzaozhemoshi;

import java.util.ArrayList;

/**
 *  导演类
 *  对(start,stop,enginBoom,alarm)这四个流程进行封装
 *  因为这4个流程按照排列组合可以组合成许多种
 *  所以当前类 实际上就是来 安排这几个方法的组合的 
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 下午3:35:54
 * @since 1.0
 */
public class Director {
	private ArrayList<String> sort = new ArrayList<String>();
	
	private BenzBuilder benz = new BenzBuilder();
	
	private BMWBuilder bmw = new BMWBuilder();
	
	// A款型号 的奔驰车有如下 的4种run()的顺序
	public BenzModel getABenzModel(){
		this.sort.clear();  // 清空  一定要 clear 防止数据混乱
		this.sort.add("start");
		this.sort.add("stop");
		this.sort.add("enginBoom");
		this.sort.add("alarm");
		this.benz.setSorts(this.sort);
		return (BenzModel) this.benz.getCarModel();
	}
	
	// B款型号的 奔驰车有如下的 2种run()的顺序
	public BenzModel getBBenzModel(){
		this.sort.clear();
		this.sort.add("start");
		this.sort.add("alarm");
		this.benz.setSorts(this.sort);
		return (BenzModel) this.benz.getCarModel();
		
	}
	
	// A款型号 的宝马车有如下 的4种run()的顺序
	public BMWModel getABMWModel(){
		this.sort.clear();  // 清空
		this.sort.add("start");
		this.sort.add("stop");
		this.sort.add("enginBoom");
		this.sort.add("alarm");
		this.bmw.setSorts(this.sort);
		return (BMWModel) this.bmw.getCarModel();
	}
	
	// B款型号的 宝马车有如下的 2种run()的顺序
	public BMWModel getBBMWModel(){
		this.sort.clear();
		this.sort.add("start");
		this.sort.add("alarm");
		this.bmw.setSorts(this.sort);
		return (BMWModel) this.bmw.getCarModel();
			
		}

}
