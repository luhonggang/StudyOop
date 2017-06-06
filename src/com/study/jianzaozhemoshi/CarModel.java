package com.study.jianzaozhemoshi;

import java.util.ArrayList;
import java.util.List;

/**
 *  汽车模型 抽象类
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 上午10:52:47
 * @since 1.0
 */
public abstract class CarModel {

	// 定义汽车所要做操作的顺序
	private List<String> sorts = new ArrayList<String>();
	
    protected abstract void start();
	
	protected abstract void stop();
	
	protected abstract void alarm();
	
	protected abstract void enginBoom();

	public final void run(){// 子类不会修改该方法,所以设置为final修饰
		for(int i=0;i<sorts.size();i++){
			String sortsForOption = sorts.get(i);
			if("start".equalsIgnoreCase(sortsForOption)){
				// 先发动汽车
				this.start();
			}else if("enginBoom".equalsIgnoreCase(sortsForOption)){
				// 引擎开始轰鸣
				this.enginBoom();
			}else if("alarm".equalsIgnoreCase(sortsForOption)){
				// 然后就开始跑了,跑的过程中 不适地会鸣笛
			    this.alarm();
			}else if("stop".equalsIgnoreCase(sortsForOption)){
				// 跑累了 ,就歇息一下
				this.stop();
			}
		}
		
	}
	
	// 还要将传递过来的参数 设置到类中sorts变量中
	public final void setSorts(ArrayList<String> list){
		this.sorts = list;
	}
}
