package com.study.mobanfangfamoshi;

/**
 *  抽象类 
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 上午10:09:30
 * @since 1.0
 */
public abstract class HanmanModel {

	protected abstract void start();
	
	protected abstract void stop();
	
	protected abstract void alarm();
	
	protected abstract void enginBoom();

	public final void run(){// 子类不会修改该方法,所以设置为final修饰
		// 先发动汽车
		this.start();
		
		// 引擎开始轰鸣
		this.enginBoom();
		
		// 然后就开始跑了,跑的过程中 不适地会鸣笛
		if(this.isAlarm()){
			this.alarm();
		}
		
		// 跑累了 ,就歇息一下
		this.stop();
	}
	
	/**
	 * 客户的新需求来了,说车子一启动喇叭就会响,应该是想让它响他就响
	 * 所以这 里添加一个 钩子方法  默认是会响的
	 */
	protected boolean isAlarm(){
		
		return true;
	}
}
