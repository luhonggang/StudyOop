package com.study.oop.day01;

/**
 * 
 * @author LuHongGang
 * @date 2017��6��5��
 * @time ����5:06:27
 * @since 1.0
 * 
 * ����ģʽ 
���κ�ʱ�̣�ֻҪ����Ҫ������Ĳ����ӡ�ʵ�ʡ������з��뵽��ͬ�ĵط����ر��ǵ���ϣ���ܹ������׵������޸ģ���û��ʹ�ö������תΪʹ����Щ������
���߷�����ʱ��������Եú����ã����ģʽ�Ĺؼ��Ƿ�װ�޸ģ������磬�����ϣ�����ٶ�ĳ�����з����ĵ��ã�
����ϣ��������Щ���õĿ�������ô��Ӧ���������أ���Щ����϶����㲻ϣ������ϲ���Ӧ���еĴ��룬��˴���ʹ������Ժ����׵���ӻ��Ƴ����ǡ�
 */
public class SimpleProxyDemo {
	
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");

    }
    public static void main(String[] args) {

        consumer(new RealObject()); // Interface iface = new RealObject();

        consumer(new SimpleProxy(new RealObject()));

    }


}

interface Interface {

    void doSomething();

    void somethingElse(String arg);

}

class RealObject implements Interface {

    @Override

    public void doSomething() {
        System.out.println("doSomething.");

    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);

    }

}

// ������ 
class SimpleProxy implements Interface {
    private Interface proxy;

    public SimpleProxy(Interface proxy) {
        this.proxy = proxy;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething.");
        proxy.doSomething();
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse " + arg);
        proxy.somethingElse(arg);

    }

}