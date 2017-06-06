package com.study.mobanfangfamoshi;

/**
 * 悍马车 型号H1
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 上午10:14:12
 * @since 1.0
 */
public class HanmanH1Model extends HanmanModel{

	/**
	 *  车子的喇叭响与不响 ,应该完全是由客户来掌握的,所以我们该这样设计
	 */
	private boolean alarmFlag = true;  //是否要响喇叭
	
	@Override
	public void start() {
		System.out.println("悍马H1启动");
		
	}

	@Override
	public void stop() {
		System.out.println("悍马H1停止");
		
	}

	@Override
	public void alarm() {
		System.out.println("悍马H1鸣笛");
		
	}

	@Override
	public void enginBoom() {
		System.out.println("悍马H1引擎声是这样的");
		
	}
	
	// override 父类中方法
	protected boolean isAlarm(){
		return this.alarmFlag;
	}
	
	// 要不要响喇叭,由客户来决定
	public void setAlarm(boolean isAlarm){
		this.alarmFlag = isAlarm;
	}

}
