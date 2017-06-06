package com.study.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * ��̬�����࣬ʵ��InvocationHandler�ӿ�  
 * @author LuHongGang
 * @date 2017��5��25��
 * @time ����8:37:50
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
		//����֮ǰ������һЩ����  
		System.out.println("++++++++++����֮ǰ++++++++++");
        method.invoke(ac, args);  
        System.out.println("++++++++++����֮��++++++++++"
        		+ "");
        //����֮��Ҳ������һЩ����  
        return null;  
	}

}
