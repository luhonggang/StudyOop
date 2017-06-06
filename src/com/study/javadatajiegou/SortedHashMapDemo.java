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
 * 面试题 :
 *   1.已知一个HashMap<Integer，Person>集合， Person有name（String）和age（int）属性。
	 2.请写一个方法实现对HashMap的排序功能。该方法接收HashMap<Integer，Person>为形参，
	        返回类型为HashMap<Integer，Person>，要求对HashMap中的Person的age升序进行排序。
	        排序时key=value键值对不得拆散。
 * @author LuHongGang
 * @date 2017年6月6日
 * @time 上午9:16:17
 * @since 1.0
 */
public class SortedHashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, Person> map = new LinkedHashMap<Integer, Person>();
        map.put(0, new Person("小明", 20));
        map.put(1, new Person("小二", 26));
        map.put(2, new Person("小四", 19));
        map.put(3, new Person("阿七", 33));
        map.put(4, new Person("十四", 25));
        map.put(4, new Person("小花", 19));
        System.out.println(map);
        HashMap<Integer, Person> sortedHashMap = SortedHashMap(map);
        System.out.println(sortedHashMap);
    }

    public static HashMap<Integer, Person> SortedHashMap(
            HashMap<Integer, Person> map) {
        // 获得键值对Set集合
        Set<Entry<Integer, Person>> entrySet = map.entrySet();
        // 将键值对Set集合转化为List以用Collections来排序
        List<Entry<Integer, Person>> list = new ArrayList<Map.Entry<Integer, Person>>(
                entrySet);
        // 通过Collections来排序，添加比较器，比较年龄
        Collections.sort(list, new Comparator<Entry<Integer, Person>>() {
            @Override
            public int compare(Entry<Integer, Person> o1, Entry<Integer, Person> o2) {
                int result = o2.getValue().age - o1.getValue().age;
                result = result == 0 ? o2.hashCode() - o1.hashCode() : result;
                return result;
            }
        });

        // 创建LinkedHashMap来存储排好序的List元素
        LinkedHashMap<Integer, Person> linkedHashMap = new LinkedHashMap<Integer, Person>();
        // 遍历List，将元素添加到linkedHashMap中
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
