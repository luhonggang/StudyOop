package com.study.myself;

import java.util.ArrayList;
import java.util.List;

public class SubListOptions {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<1;i++){
			list.add(i);//0 1 2 3 4
			
		}
		System.out.println("����ĳ���:"+list.size());
		System.out.println(list.subList(0,(int) (list.size()*0.8)));// 1 �����ݵ�ʱ��  >> success
		System.out.println(list.subList((int) (list.size()*0.8),list.size()));
	}

}
