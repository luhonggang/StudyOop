package com.study.classloader;

/**
 *  自定义的类加载器,用于将字节码转换为class对象
 * @author LuHongGang
 * @date 2017年5月26日
 * @time 下午2:53:54
 * @since 1.0
 */
public class MyClassLoader extends ClassLoader{

	public Class<?> defineMyClass(byte[] b,int off, int len)
	{
		return super.defineClass(b, off, len);
	}
}
