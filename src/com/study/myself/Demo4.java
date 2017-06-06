package com.study.myself;

import java.util.Arrays;

public class Demo4 {
	
	public static void main(String[] args) {
		
	 String str = "上海自来水来自海上";
	 if(IsHuiWen(str))
		 System.out.println("是 回 文 数 字 ");
	 else
		 System.out.println("不是回文数字");
	 
	 getBytes(str);
	 
	 
	 
	}
	
	// 判断是否是回文数字
	public static boolean IsHuiWen(String str){
		boolean flag = true;
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i) !=str.charAt(str.length()-1-i)){
				flag = false;
				break;
			}
		}
		return flag;
	}
	// 以当前系统的编码为基础,返回当前字符串所对应二进制序列
	public static void getBytes(String str){
		byte[] strs = str.getBytes();
		System.out.println(Arrays.toString(strs));
	}

}
