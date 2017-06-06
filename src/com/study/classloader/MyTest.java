package com.study.classloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MyTest {

	public static void main(String[] args) throws IOException, IOException, InstantiationException, IllegalAccessException {
		// 读取本地的class文件内的字节码,转换为字节码数组
		InputStream input = new FileInputStream(
				new File(".").getCanonicalPath()+
				"\\bin\\com\\study\\classloader\\Programmer.class");
		byte[] result = new byte[1024];
		int count = input.read(result);
		// 使用自定义的类加载器将byte字节码数组转换成对应的class对象
		MyClassLoader loader = new MyClassLoader();
		Class clazz = loader.defineMyClass(result, 0, count);
		// 测试加载是否成功,打印class对象的名称
		System.out.println(clazz.getCanonicalName());
		
		Object o = clazz.newInstance();
		try {
			// 调用Programmer的code方法
			clazz.getMethod("code", null).invoke(o, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
