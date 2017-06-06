package com.study.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 动态代理类，实现InvocationHandler接口  
 * @author LuHongGang
 * @date 2017年5月25日
 * @time 下午8:37:50
 * @since 1.0
 */
public class Invoker implements InvocationHandler {

	AbstrucClass ac;
	
	public Invoker(AbstrucClass ac){
		this.ac = ac;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//调用之前可以做一些处理  
		System.out.println("++++++++++调用之前++++++++++");
        method.invoke(ac, args);  
        System.out.println("++++++++++调用之后++++++++++"
        		+ "");
        //调用之后也可以做一些处理  
        return null;  
	}

}
