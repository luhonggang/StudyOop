package com.study.classloader;

/**
 *  �Զ�����������,���ڽ��ֽ���ת��Ϊclass����
 * @author LuHongGang
 * @date 2017��5��26��
 * @time ����2:53:54
 * @since 1.0
 */
public class MyClassLoader extends ClassLoader{

	public Class<?> defineMyClass(byte[] b,int off, int len)
	{
		return super.defineClass(b, off, len);
	}
}
