package com.study.oop.day01;

/**
 * 
 * @author LuHongGang
 * @date 2017年6月5日
 * @time 下午5:06:27
 * @since 1.0
 * 
 * 代理模式 
在任何时刻，只要你想要将额外的操作从“实际”对象中分离到不同的地方，特别是当你希望能够很容易地做出修改，从没有使用额外操作转为使用这些操作，
或者反过来时，代理就显得很有用（设计模式的关键是封装修改）。例如，如果你希望跟踪对某个类中方法的调用，
或者希望度量这些调用的开销，那么你应该怎样做呢？这些代码肯定是你不希望将其合并到应用中的代码，因此代理使得你可以很容易地添加或移除它们。
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

// 代理类 
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