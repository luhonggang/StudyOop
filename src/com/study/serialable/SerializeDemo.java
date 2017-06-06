package com.study.serialable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		Emp e = new Emp();
		e.name = "����";
		e.id = 1000;
		e.deptNo=1001;
		e.sal=12000.00;
		try {
			/**
			 *  �ļ�����������ڽ�����д�뵽�����File��FileDescriptor.
			 */
			FileOutputStream fos = new FileOutputStream("W:\\workTest\\JavaOOP\\tmp\\emp.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e);
			oos.close();
			fos.close();
			System.out.println("���л� ok");
			
			// �����л� 
			System.out.println("�����л� ��ʼ");
			// ���� ������ 
			FileInputStream fis = new FileInputStream("W:\\workTest\\JavaOOP\\tmp\\emp.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Emp obj = (Emp) ois.readObject();
			System.out.println("~~~�����л� �ɹ�: ��ȡ�������������: "+obj.getName()+"  "+obj.getDeptNo());
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
	}
}
