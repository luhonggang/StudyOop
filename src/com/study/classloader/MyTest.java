package com.study.classloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MyTest {

	public static void main(String[] args) throws IOException, IOException, InstantiationException, IllegalAccessException {
		// ��ȡ���ص�class�ļ��ڵ��ֽ���,ת��Ϊ�ֽ�������
		InputStream input = new FileInputStream(
				new File(".").getCanonicalPath()+
				"\\bin\\com\\study\\classloader\\Programmer.class");
		byte[] result = new byte[1024];
		int count = input.read(result);
		// ʹ���Զ�������������byte�ֽ�������ת���ɶ�Ӧ��class����
		MyClassLoader loader = new MyClassLoader();
		Class clazz = loader.defineMyClass(result, 0, count);
		// ���Լ����Ƿ�ɹ�,��ӡclass���������
		System.out.println(clazz.getCanonicalName());
		
		Object o = clazz.newInstance();
		try {
			// ����Programmer��code����
			clazz.getMethod("code", null).invoke(o, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
