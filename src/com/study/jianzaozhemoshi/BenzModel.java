package com.study.jianzaozhemoshi;

public class BenzModel extends CarModel{

	@Override
	protected void start() {
		System.out.println("`````````������������ʼ������``````````");
		
	}

	@Override
	protected void stop() {
		System.out.println("`````````���۳�ͣ��������Ҫʱ���`````````");
		
	}

	@Override
	protected void alarm() {
		System.out.println("`````````���۳���������������`````````");
		
	}

	@Override
	protected void enginBoom() {
		System.out.println("`````````���۳��������������е��`````````");
		
	}

}
