package com.study.oop.day01;
/**
 * 在父类构造函数内部调用具有多态行为的函数将导致无法预测的结果，
 * 因为此时子类对象还没初始化，此时调用子类方法不会得到我们想要的结果。
 * @author LuHongGang
 * @date 2017年6月5日
 * @time 下午4:30:36
 * @since 1.0
 * 
 * 
 Java中构造函数的调用顺序：

（1）在其他任何事物发生之前，将分配给对象的存储空间初始化成二进制0； 
（2）调用基类构造函数。从根开始递归下去，因为多态性此时调用子类覆盖后的draw()方法（要在调用RoundGlyph构造函数之前调用），由于步骤1的缘故，我们此时会发现radius的值为0； 
（3）按声明顺序调用成员的初始化方法； 
（4）最后调用子类的构造函数。
 */
public class PolyConstructors {
    public static void main(String[] args) {

        new RoundGlyph(5);


    }


}

class Glyph {

    void draw() {

        System.out.println("Glyph.draw()");

    }

    Glyph() {

        System.out.println("Glyph() before draw()");

        draw();

        System.out.println("Glyph() after draw()");

    }

}


class RoundGlyph extends Glyph {

    private int radius = 1;


    RoundGlyph(int r) {

        radius = r;

        System.out.println("RoundGlyph.RoundGlyph(). radius = " + radius);

    }


    void draw() {

        System.out.println("RoundGlyph.draw(). radius = " + radius);

    }

}


