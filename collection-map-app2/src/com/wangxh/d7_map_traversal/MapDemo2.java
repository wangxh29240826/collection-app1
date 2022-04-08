package com.wangxh.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String ,Integer> maps = new HashMap<>();
        //1.添加元素：无序，不重复，无索引
        maps.put("嘿嘿嘿",200);
        maps.put("嘿嘿",100);
        maps.put("嘿嘿嘿",200);
        maps.put("手机",20);
        System.out.println(maps);

        //1.把map集合转换成set集合
        Set<Map.Entry<String,Integer>> entries = maps.entrySet();
        //2.开始遍历
        for (Map.Entry<String,Integer> entry:entries) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + "--->" + value);
        }
    }
}
