package com.study.jianzaozhemoshi;

public class BenzModel extends CarModel{

	@Override
	protected void start() {
		System.out.println("`````````奔驰是这样开始启动的``````````");
		
	}

	@Override
	protected void stop() {
		System.out.println("`````````奔驰车停下来还是要时间的`````````");
		
	}

	@Override
	protected void alarm() {
		System.out.println("`````````奔驰车喇叭声是这样的`````````");
		
	}

	@Override
	protected void enginBoom() {
		System.out.println("`````````奔驰车引擎声音还是有点大`````````");
		
	}

}
