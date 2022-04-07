package com.wangxh.com.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;


    /**
     * 1.集合的代表是？
     * --1.collection
     * 2.collection集合分了哪2大常用的集合体系
     * --1.list系列集合：添加的元素是有序，可重复，由索引
     * --2.set系列集合：添加的元素是无序，不重复，无索引
     * 3.如何约定集合存储数据的类型，需要注意什么?
     * --1.集合支持泛型
     */
    public class CollectionDemo1 {
        public static void main(String[] args) {
            //有序 可重复 有索引
            Collection list = new ArrayList();
            list.add("java");
            list.add("java");
            list.add("Mybatis");
            list.add(23);
            list.add(23);
            list.add(false);
            list.add(false);
            System.out.println(list);

            //无序 不重复 无索引
            Collection list1 = new HashSet();
            list1.add("java");
            list1.add("java");
            list1.add("Mybatis");
            list1.add(23);
            list1.add(23);
            list1.add(false);
            list1.add(false);
            System.out.println(list1);

            System.out.println("-----------------------------------");

            Collection<String> list2 = new ArrayList<>(); //jdl7开始之后后面类型申明可以不写
            list2.add("java");
            list2.add("黑马");

            //集合和泛型不支持基本数据类型，只能支持引用数据类型
            Collection<Integer> list3 = new ArrayList<>();
            list3.add(23);
            list3.add(233);
            list3.add(2333);
            System.out.println(list3);
        }
    }
