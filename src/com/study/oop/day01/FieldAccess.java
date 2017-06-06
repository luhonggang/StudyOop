package com.study.oop.day01;

/** Direct field access is determined at compile time.
 * Java类中属性域的访问操作都由编译器解析，因此不是多态的。父类和子类的同名属性都会分配不同的存储空间
 * 对属性字段的访问由Java的对象的类型来决定的  
 * 类型.属性
 * @author LuHongGang
 * @date 2017年6月5日
 * @time 下午4:48:49
 * @since 1.0
 */
public class FieldAccess {

	 public static void main(String[] args) {

	     Super sup = new Sub();

	     System.out.println("sup.filed = " + sup.field + 

	             ", sup.getField() = " + sup.getField());

	     Sub sub = new Sub();

	     System.out.println("sub.filed = " + sub.field + 

	             ", sub.getField() = " + sub.getField() + 

	             ", sub.getSuperField() = " + sub.getSuperField());

	 }


	}

class Super {

 public int field = 0;

 public int getField() {

     return field;

 }

}

class Sub extends Super {

 public int field = 1;

 public int getField() {

     return field;

 }

 public int getSuperField() {

     return super.field; // 子类调用父类的方法和属性的 方式  super.父类的方法/属性

 }

}
