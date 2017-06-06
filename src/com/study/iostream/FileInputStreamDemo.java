package com.study.iostream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 基本流 :FIS FOS
 *  字节流:以一个字节为单位,以"Stream"结尾
 *  字符流:以一个字符为单位,以"Reader/Writer" 结尾
 *  FileInputStream 文件字节输入流 
 * @author LuHongGang
 * @date 2017年6月1日
 * @time 上午10:39:23
 * @since 1.0
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		try {
			/**
			 *  若文件 testFIS.txt 不存在 抛出FileNotFoundException 
			 *  java.io.FileNotFoundException: W:\workTest\JavaOOP\tmp\testFIS.txt (系统找不到指定的文件。)
			 */
			FileInputStream fis = new FileInputStream("W:\\workTest\\JavaOOP\\tmp\\testFIS.txt");
			InputStreamReader isr = new InputStreamReader(fis,"GBK"); // 文件字符输入流
		    BufferedReader br = new BufferedReader(isr); // 字符缓冲流  高级流
		    String str = null;
		    if((str = br.readLine()) != null){// readLine() 读取每一行 字符并以字符串的形式返回
		    	System.out.println("读取的字符: "+str);
		    }
		    fis.close();
		    isr.close();
		    br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
