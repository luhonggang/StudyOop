package com.study.iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *  文件字节输出流
 * @author LuHongGang
 * @date 2017年6月1日
 * @time 上午11:16:35
 * @since 1.0
 */
public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = null;
		try {
			FileOutputStream  fos = new FileOutputStream("W:\\workTest\\JavaOOP\\tmp\\testFOS.txt");
			osw  = new OutputStreamWriter(fos);// 字符输出高级流  默认构造方法使用系统默认的编码集
			String str="我是一个程序猿,天天都在找对象.";
			osw.write(str);
			osw.flush();  // 将缓冲区中的数据一次性写出
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw e;
		} finally{
			if(osw !=null){
				osw.close();
			}
		}
		
	}
}
