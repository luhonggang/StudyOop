package com.study.oop.day01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK 动态代理 
 *   动态的创建代理并动态的处理对所代理的方法的调用
 * @author LuHongGang
 * @date 2017年6月5日
 * @time 下午5:15:46
 * @since 1.0
 */
public class JdkDongTaiDaiLi {
    public static void consumer(Interface iface) {

        iface.doSomething();

        iface.somethingElse("bonobo");

    }

    public static void main(String[] args) {

        RealObject real = new RealObject();

        consumer(real);

        // insert a proxy and call again:

        Interface proxy = (Interface)Proxy.newProxyInstance(

                Interface.class.getClassLoader(), 

                new Class[]{ Interface.class },

                new DynamicProxyHandler(real));


        consumer(proxy);

    }


}


class DynamicProxyHandler implements InvocationHandler {
	    private Object proxy;
	
	    public DynamicProxyHandler(Object proxy) {
	        this.proxy = proxy;
	    }
	
	
	    @Override
	    public Object invoke(Object proxy, Method method, Object[] args)
	            throws Throwable {
	        System.out.println("*** proxy: " + proxy.getClass() +
	                ". method: " + method + ". args: " + args);
	
	        if(args != null) {
	            for(Object arg : args)
	                System.out.println(" " + arg);
	        }
	
	        return method.invoke(this.proxy, args);
	
	    }
	
	}
	
	
	