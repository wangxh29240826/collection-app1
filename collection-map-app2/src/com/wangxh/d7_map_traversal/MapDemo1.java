package com.wangxh.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {

    /**
     *
     * Map集合的遍历方式一：键找值
     * 先获取Map集合的全部键的Set集合
     * 遍历键的Set集合，然后通过提取对应值
     * 键找值涉及的api
     * Set<K> keySet() 获取所有键的集合
     * V get（Object key） 根据键获取值
     */
    public static void main(String[] args) {
        Map<String ,Integer> maps = new HashMap<>();
        //1.添加元素：无序，不重复，无索引
        maps.put("嘿嘿嘿",200);
        maps.put("嘿嘿",100);
        maps.put("嘿嘿嘿",200);
        maps.put("手机",20);
        System.out.println(maps);

        //1.第一种遍历方式 先拿到集合的全部键
        Set<String> keys = maps.keySet();
        //2.第二步：遍历每个键
        for (String key: keys) {
            int value = maps.get(key);
            System.out.println(key + "--->" + value);
        }
    }
}
