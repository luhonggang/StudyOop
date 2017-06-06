package com.study.oop.day01;
/**
 * �ڸ��๹�캯���ڲ����þ��ж�̬��Ϊ�ĺ����������޷�Ԥ��Ľ����
 * ��Ϊ��ʱ�������û��ʼ������ʱ�������෽������õ�������Ҫ�Ľ����
 * @author LuHongGang
 * @date 2017��6��5��
 * @time ����4:30:36
 * @since 1.0
 * 
 * 
 Java�й��캯���ĵ���˳��

��1���������κ����﷢��֮ǰ�������������Ĵ洢�ռ��ʼ���ɶ�����0�� 
��2�����û��๹�캯�����Ӹ���ʼ�ݹ���ȥ����Ϊ��̬�Դ�ʱ�������า�Ǻ��draw()������Ҫ�ڵ���RoundGlyph���캯��֮ǰ���ã������ڲ���1��Ե�ʣ����Ǵ�ʱ�ᷢ��radius��ֵΪ0�� 
��3��������˳����ó�Ա�ĳ�ʼ�������� 
��4������������Ĺ��캯����
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


