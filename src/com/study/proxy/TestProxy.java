package com.study.proxy;

import java.lang.reflect.Proxy;

/**
 * ������  ������JDK�Ķ�̬����ʵ��
 * @author LuHongGang
 * @date 2017��5��25��
 * @time ����8:40:15
 * @since 1.0
 * /** 
 * ��̬������ʹ�õ���һ���ӿ�InvocationHandler��һ��������Proxy �������������ʹ��ʵ���˶�̬����Ĺ��ܡ� 
 * ��ôʲô�Ƕ�̬�����أ� 
 * ����ƽ��˵�Ĵ�������ָ�� ��ÿ��������дһ�������࣬�Ժ�Ҫʹ��ĳ��������ʱ��ֻҪ�������Ĵ�����Ķ���Ȼ����ô�����ķ����Ϳ����ˡ� 
 * ����������������ľ����࣬�Ǿ���Ҫ�����Ĵ�����ſ��ԣ���������Ȼ�����ʡ����Զ�̬�����Ӧ�˶����ˣ�����ֻҪдһ����ʵ�� 
 * InvocationHandler ��ʵ������invoke������Ȼ������Proxy�Ĺ�������newProxyInstance��������һ����������������ͬ������ʵ�ֶԾ�����Ĵ����ܡ� 
 * ����������ĸ������ֻ࣬Ҫ��Handler�����´����е�Invoker���Ĺ��������������������ʵ���Ϳ����ˡ��о��ǲ����Լ�Ϊ�þ���������һ���������أ��Ǻ�~ 
 */
 
public class TestProxy {
 
	public static void main(String[] args) {
		// ����������Class A �Ĵ������
		Invoker invoker = new Invoker(new A());
		// ��ȡ�������class A �Ĵ���
		AbstrucClass ac = (AbstrucClass) Proxy.newProxyInstance(
				AbstrucClass.class.getClassLoader(),
				new Class[]{ AbstrucClass.class},invoker);
		ac.show();
		
		
	}
}
