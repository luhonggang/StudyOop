package com.study.thread;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class TestVolatile2 {  
	  
    volatile int count;  
    Map<String, String> map = new ConcurrentHashMap<String, String>();  
  
    public void addContent(String key, String value) {  
        if (count < 100) {  
            map.put(key, value);  
            count++;  
        }  
    }  
  
    @Test  
    public void testAddContent() throws Exception {  
        ExecutorService executorService = Executors.newFixedThreadPool(10);  
  
        for (int i = 0; i < 10; i++) {  
            executorService.execute(new AddContentTask());  
        }  
        // �ر������߳�  
        executorService.shutdown();  
        // �ȴ����߳̽������ټ���ִ������Ĵ���  
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);  
  
        System.out.println(map.size());  
  
    }  
  
    private final class AddContentTask implements Runnable {  
  
        @Override  
        public void run() {  
            //ÿ���̷߳�11��  
            for (int i = 0; i <= 10; i++) {  
                addContent(Thread.currentThread().getName() + " " + System.currentTimeMillis() + " " + i, "value");  
            }  
        }  
    }  
  
  
}  
