package com.study.mobanfangfamoshi;

/**
 * 悍马车 型号 H2
 * @author LuHongGang
 * @date 2017年6月2日
 * @time 上午10:16:48
 * @since 1.0
 */
public class HanmanH2Model extends HanmanModel{

	@Override
	public void start() {
		System.out.println("悍马H2启动");
		
	}

	@Override
	public void stop() {
		System.out.println("悍马H2停止");
		
	}

	@Override
	public void alarm() {
		System.out.println("悍马H2鸣笛");
		
	}

	@Override
	public void enginBoom() {
		System.out.println("悍马H2引擎声是这样的");
		
	}
	// 钩子方法 H2型号的悍马车 喇叭默认不会响
    protected boolean isAlarm(){
		
		return false;
	}

}
