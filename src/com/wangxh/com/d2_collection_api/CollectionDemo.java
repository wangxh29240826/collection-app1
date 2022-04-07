package com.wangxh.com.d2_collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        //1.HashSet：添加的元素是无序，不重复，无索引。
        Collection<String> list = new ArrayList<>();
        //1.添加元素，添加成功返回true
        list.add("java");
        list.add("HTML");
        System.out.println(list.add("HTML"));
        System.out.println(list);

        //2.清空集合的元素
//        list.clear();
//        System.out.println(list);


        //3.判断结合是否为空，是空返回true反之false
        System.out.println(list.isEmpty());
        System.out.println("-----------------------------");
        //4.获取集合的大小
        System.out.println(list.size());
        System.out.println("------------------------------");
        //5.判断结合是否包含某个元素
        System.out.println(list.contains("java"));
        System.out.println(list.contains("Java"));
        System.out.println(list.contains("黑马"));
        System.out.println("-------------------------------");

        //6.删除某个元素：如果有多个重复元素默认删除前面的第一个
        System.out.println(list.add("java"));
        System.out.println(list);
        System.out.println(list.remove("java"));
        System.out.println(list);

        //7.把集合转换成数组
        Object[] arrs = list.toArray();
        System.out.println("数组" + Arrays.toString(arrs));

        System.out.println("---------------拓展");
        Collection<String> list2 = new ArrayList<>();
        list2.add("java1");
        list2.add("java2");
        Collection<String> list3 = new ArrayList<>();
        list3.add("小王");
        list3.add("小易");
        //addAll把list3集合中的元素全部倒入到list2中去
        list3.addAll(list2);
        System.out.println(list2);
        System.out.println(list3);

    }
}
