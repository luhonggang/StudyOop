package com.study.serialable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		Emp e = new Emp();
		e.name = "张三";
		e.id = 1000;
		e.deptNo=1001;
		e.sal=12000.00;
		try {
			/**
			 *  文件输出流是用于将数据写入到输出流File或FileDescriptor.
			 */
			FileOutputStream fos = new FileOutputStream("W:\\workTest\\JavaOOP\\tmp\\emp.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e);
			oos.close();
			fos.close();
			System.out.println("序列化 ok");
			
			// 反序列化 
			System.out.println("反序列化 开始");
			// 构造 输入流 
			FileInputStream fis = new FileInputStream("W:\\workTest\\JavaOOP\\tmp\\emp.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Emp obj = (Emp) ois.readObject();
			System.out.println("~~~反序列化 成功: 获取对象的属性数据: "+obj.getName()+"  "+obj.getDeptNo());
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
	}
}
