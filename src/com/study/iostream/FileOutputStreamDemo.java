package com.study.iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *  �ļ��ֽ������
 * @author LuHongGang
 * @date 2017��6��1��
 * @time ����11:16:35
 * @since 1.0
 */
public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = null;
		try {
			FileOutputStream  fos = new FileOutputStream("W:\\workTest\\JavaOOP\\tmp\\testFOS.txt");
			osw  = new OutputStreamWriter(fos);// �ַ�����߼���  Ĭ�Ϲ��췽��ʹ��ϵͳĬ�ϵı��뼯
			String str="����һ������Գ,���춼���Ҷ���.";
			osw.write(str);
			osw.flush();  // ���������е�����һ����д��
			
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
