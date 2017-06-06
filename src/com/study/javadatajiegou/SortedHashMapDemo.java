package com.study.javadatajiegou;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ������ :
 *   1.��֪һ��HashMap<Integer��Person>���ϣ� Person��name��String����age��int�����ԡ�
	 2.��дһ������ʵ�ֶ�HashMap�������ܡ��÷�������HashMap<Integer��Person>Ϊ�βΣ�
	        ��������ΪHashMap<Integer��Person>��Ҫ���HashMap�е�Person��age�����������
	        ����ʱkey=value��ֵ�Բ��ò�ɢ��
 * @author LuHongGang
 * @date 2017��6��6��
 * @time ����9:16:17
 * @since 1.0
 */
public class SortedHashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, Person> map = new LinkedHashMap<Integer, Person>();
        map.put(0, new Person("С��", 20));
        map.put(1, new Person("С��", 26));
        map.put(2, new Person("С��", 19));
        map.put(3, new Person("����", 33));
        map.put(4, new Person("ʮ��", 25));
        map.put(4, new Person("С��", 19));
        System.out.println(map);
        HashMap<Integer, Person> sortedHashMap = SortedHashMap(map);
        System.out.println(sortedHashMap);
    }

    public static HashMap<Integer, Person> SortedHashMap(
            HashMap<Integer, Person> map) {
        // ��ü�ֵ��Set����
        Set<Entry<Integer, Person>> entrySet = map.entrySet();
        // ����ֵ��Set����ת��ΪList����Collections������
        List<Entry<Integer, Person>> list = new ArrayList<Map.Entry<Integer, Person>>(
                entrySet);
        // ͨ��Collections��������ӱȽ������Ƚ�����
        Collections.sort(list, new Comparator<Entry<Integer, Person>>() {
            @Override
            public int compare(Entry<Integer, Person> o1, Entry<Integer, Person> o2) {
                int result = o2.getValue().age - o1.getValue().age;
                result = result == 0 ? o2.hashCode() - o1.hashCode() : result;
                return result;
            }
        });

        // ����LinkedHashMap���洢�ź����ListԪ��
        LinkedHashMap<Integer, Person> linkedHashMap = new LinkedHashMap<Integer, Person>();
        // ����List����Ԫ����ӵ�linkedHashMap��
        for (Entry<Integer, Person> entry : list) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }

        return linkedHashMap;
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
