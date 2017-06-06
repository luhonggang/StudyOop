package com.study.oop.day01;
/**
 * 如果某个方法是静态 的,它的行为就不具有多态性
 * @author LuHongGang
 * @date 2017年6月5日
 * @time 下午4:19:21
 * @since 1.0
 * 构造函数并不具有多态性，它们实际上是static方法，
 * 只不过该static声明是隐式的。因此，构造函数不能够被override。
 */
public class staticDemo {

	public static void main(String[] args) {
 
		StaticSuper ss = new StaticSub();
		ss.StaticMethod();                              // 这里调用的是父类中的静态方法  子类不能都重写父类中的该静态方法
		ss.NotStaticMethod();
		//ss.ThisMethodIsNotExistsInSuper();            // 程序编译不通过,向上造型   初始化后的对象只能调用 父类类型的方法和属性
		/**
		 * Java 中向上造型: 父类类型的引用 指向子类的对象
		 * StaticSuper ss = new StaticSub();
		 */
		
		StaticSuper ss2 =  new StaticSuper();           // 向下造型
		StaticSub  ss3 = (StaticSub) ss;              
		//ss2.ThisMethodIsNotExistsInSuper();
		//StaticSub ss4 = (StaticSub) new StaticSuper();//编译通过 ,运行异常
		//ss3.ThisMethodIsNotExistsInSuper(); 运行时异常
		System.out.println(ss3.name);
		
		// 所以向下造型的时候 需要使用instanceof 
		if(ss2 instanceof StaticSub){                   // 向下造型 的时候强制需要进行 判断  false
			StaticSub ss5 = (StaticSub) ss2;
            System.out.println(ss5.name);
			
		}else{
			System.out.println(" 左边对象不是右边类的实例 ");
		}
		
		if(ss instanceof StaticSub){                    // true
			StaticSub ss6 = (StaticSub) ss;
			System.out.println(" 左边对象是右边类的实例 ");
			ss6.ThisMethodIsNotExistsInSuper();         //
		}
	}

}

class StaticSuper{
	public static void StaticMethod(){
		System.out.println("我是   父类   的静态方法");
	}
	
	public void NotStaticMethod(){
		System.out.println("我是   父类   的非静态方法");
	}
}

class StaticSub extends StaticSuper{
	String name = "10010";
	public static void StaticMethod(){
		System.out.println("我是  子类  的静态方法");
	}
	
	public void NotStaticMethod(){
		System.out.println("我是  子类  的非静态方法");
	}
	/**
	 *  该方法 在父类中并不存在,仅仅在子类中独有  
	 *  
	 */
	public void ThisMethodIsNotExistsInSuper(){
		System.out.println("仅仅是子类独有的方法,这是 本类的一个扩展");
	}
}
