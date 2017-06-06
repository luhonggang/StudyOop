package com.study.redis;

import redis.clients.jedis.Jedis;

/**
 *  ����Զ�����ӷ������ϵ�redis 
 * @author LuHongGang
 * @date 2017��5��25��
 * @time ����10:36:39
 * @since 1.0
 */
public class TestRedisConnection {

	public static void main(String[] args) {
		  //���ӱ��ص� Redis ����
	      Jedis jedis = new Jedis("192.168.44.128",6379,5000);
	      System.out.println("Connection to server sucessfully");
	      
	      // ����redis�ַ�������
	      jedis.set("rowKey", "just so so");
	      
	      // ��ȡ�洢�����ݲ����
	      System.out.println("loading this data of redis: "+jedis.get("rowKey"));
	      //�鿴�����Ƿ�����
	      System.out.println("Server is running: "+jedis.ping());
	}
}
