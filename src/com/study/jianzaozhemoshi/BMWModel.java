package com.study.jianzaozhemoshi;

public class BMWModel extends CarModel{

	@Override
	protected void start() {
		System.out.println("`````````宝马车是这样启动的`````````");
		
	}

	@Override
	protected void stop() {
		System.out.println("`````````宝马车是这样停止的`````````");
		
	}

	@Override
	protected void alarm() {
		System.out.println("`````````宝马车喇叭声有点小`````````");
		
	}

	@Override
	protected void enginBoom() {
		System.out.println("`````````宝马车的引擎声是这样的`````````");
		
	}

}
