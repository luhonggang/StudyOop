package com.study.oop.day01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
	Map<String,String> map = new HashMap<String,String>(128);
	map.put("demo", "123456789");
	System.out.println(map.get("demo"));
    map.clear();
    System.out.println(map.get("demo"));
    
    int val = 10; 
    int s = val * 8;
    int s1 = val << 3;// Î»ÒÆÔËËã·û
    System.out.println(s+"  "+s1);// 80 80
	}

}
