package com.wangxh.d1_set;


import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        //来看Set系列集合的特点：HashSet LinkedHashSet TreeSet
        //无序不重复，无索引
        //LinkHashSet是有序的 无重复无索引
        //Hashset 是无序 无重复，无索引

        Set<String> sets = new LinkedHashSet<>();
        sets.add("html");
        sets.add("Java");
        sets.add("Java");
        sets.add("Mysql");
        sets.add("mysql");
        sets.add("css");
        System.out.println(sets);
        /**
         * 总结
         * 1.Set系列结合的特点
         * 2.Set集合的实现类特点
         * HashSet无序，不重复，五索引
         * LinkedHashSet有序，不重复。五索引
         * TreeSet可排序，不重复，五索引
         */
    }
}
