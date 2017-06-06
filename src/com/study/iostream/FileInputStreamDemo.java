package com.study.iostream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ������ :FIS FOS
 *  �ֽ���:��һ���ֽ�Ϊ��λ,��"Stream"��β
 *  �ַ���:��һ���ַ�Ϊ��λ,��"Reader/Writer" ��β
 *  FileInputStream �ļ��ֽ������� 
 * @author LuHongGang
 * @date 2017��6��1��
 * @time ����10:39:23
 * @since 1.0
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		try {
			/**
			 *  ���ļ� testFIS.txt ������ �׳�FileNotFoundException 
			 *  java.io.FileNotFoundException: W:\workTest\JavaOOP\tmp\testFIS.txt (ϵͳ�Ҳ���ָ�����ļ���)
			 */
			FileInputStream fis = new FileInputStream("W:\\workTest\\JavaOOP\\tmp\\testFIS.txt");
			InputStreamReader isr = new InputStreamReader(fis,"GBK"); // �ļ��ַ�������
		    BufferedReader br = new BufferedReader(isr); // �ַ�������  �߼���
		    String str = null;
		    if((str = br.readLine()) != null){// readLine() ��ȡÿһ�� �ַ������ַ�������ʽ����
		    	System.out.println("��ȡ���ַ�: "+str);
		    }
		    fis.close();
		    isr.close();
		    br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
