package com.study.redis;

import redis.clients.jedis.Jedis;

/**
 *  本地远程连接服务器上的redis 
 * @author LuHongGang
 * @date 2017年5月25日
 * @time 上午10:36:39
 * @since 1.0
 */
public class TestRedisConnection {

	public static void main(String[] args) {
		  //连接本地的 Redis 服务
	      Jedis jedis = new Jedis("192.168.44.128",6379,5000);
	      System.out.println("Connection to server sucessfully");
	      
	      // 设置redis字符串数据
	      jedis.set("rowKey", "just so so");
	      
	      // 获取存储的数据并输出
	      System.out.println("loading this data of redis: "+jedis.get("rowKey"));
	      //查看服务是否运行
	      System.out.println("Server is running: "+jedis.ping());
	}
}
