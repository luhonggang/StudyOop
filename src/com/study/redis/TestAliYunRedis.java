package com.study.redis;

import java.util.ArrayList;
import java.util.List;

import redis.clients.jedis.Jedis;

public class TestAliYunRedis {

	public static void main(String[] args) {
		try {
		String host = "xx.kvstore.aliyuncs.com";//����̨��ʾ���ʵ�ַ
		int port = 6379;
		Jedis jedis = new Jedis(host, port);
		//��Ȩ��Ϣ
		jedis.auth("password");//password
		String key = "redis";
		String value = "aliyun-redis";
		//select dbĬ��Ϊ0
		jedis.select(1);
		//setһ��key
		jedis.set(key, value);
		System.out.println("Set Key " + key + " Value: " + value);
		//get ���ý�ȥ��key
		String getvalue = jedis.get(key);
		System.out.println("Get Key " + key + " ReturnValue: " + getvalue);
		jedis.quit();
		jedis.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
	
		List list = new ArrayList<>();
		
	}
}
