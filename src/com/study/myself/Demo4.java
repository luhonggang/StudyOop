package com.study.myself;

import java.util.Arrays;

public class Demo4 {
	
	public static void main(String[] args) {
		
	 String str = "�Ϻ�����ˮ���Ժ���";
	 if(IsHuiWen(str))
		 System.out.println("�� �� �� �� �� ");
	 else
		 System.out.println("���ǻ�������");
	 
	 getBytes(str);
	 
	 
	 
	}
	
	// �ж��Ƿ��ǻ�������
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
	// �Ե�ǰϵͳ�ı���Ϊ����,���ص�ǰ�ַ�������Ӧ����������
	public static void getBytes(String str){
		byte[] strs = str.getBytes();
		System.out.println(Arrays.toString(strs));
	}

}
