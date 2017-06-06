package com.study.myself;

/**
 * 类的继承  
 * 方法的重写
 * 子类重写父类中的方法  >> 则子类方法的方法签名和返回值类型都必须和父类中的方法的签名和返回值类型一致
 * 注意:返回值的类型必须一致
 * @author LuHongGang
 * @date 2017年5月24日
 * @time 上午10:21:26
 * @since 1.0
 */
public class Sun extends Father{

	public String name="mmm";
	public int runCar(){
		System.out.println("儿子是会开车");
		return 1;
	}
	public static void main(String[] args) {
		Sun s = new Sun();
		System.out.println(s.name);// 子类的
		
		/**
		 * 若子类不存在 public String name="mmm"; 
		 * 则再次使用s.name调用的就是父类中非private修饰的变量name
		 */
		
	}
}
