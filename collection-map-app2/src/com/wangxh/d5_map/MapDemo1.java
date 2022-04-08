package com.wangxh.d5_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Map集合体现特点
 * 目标：认识Map体系的特点：按照键无序，不重复，五索引，值不做要求
 * Map集合后面重复的键对应的值都会覆盖前面重复键的值
 * Map集合的键值对都可以为null
 *
 *
 * Map集合实现类特点
 * HashMap:元素按照键是无序，不重复，无索引，值不做要求
 * LinkedHashMap:元素按照键是有序，不重复，无索引，值不做要求
 *TreeMap：元素按照键是排序，不重复，无索引，值不做要求
 */
public class MapDemo1 {
    public static void main(String[] args) {
        //1.创建一个Map集合的对象d
        Map<String,Integer> maps = new LinkedHashMap<>();
        maps.put("java",1);
        maps.put("jav",13);
        maps.put("ja",12);
        maps.put("java",1);
        maps.put(null,null);
        System.out.println(maps);
        System.out.println("------------------");

        Map<String,Integer> maps1  = new HashMap<>();
        maps1.put("java",1);
        maps1.put("jav",13);
        maps1.put("ja",12);
        maps1.put("java",1);
        maps1.put(null,null);
        System.out.println(maps1);

    }
}
