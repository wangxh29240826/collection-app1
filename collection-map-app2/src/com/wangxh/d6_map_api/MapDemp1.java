package com.wangxh.d6_map_api;

import java.util.*;

public class MapDemp1 {
    public static void main(String[] args) {
        //1.添加元素：无序不重复无索引
        Map<String,Integer> maps = new HashMap<>();
        maps.put("iqqo5pro",10);
        System.out.println(maps);

        //2.清空集合
        maps.clear();
        System.out.println(maps);
        //3.判断集合是否为空，为空返回true，反之false
        System.out.println(maps.isEmpty());
        //4.根据键获取对应值：public V get(Object key)
        Integer key = maps.get("huawei");
        System.out.println(key);
        System.out.println(maps.get("生活用品1"));
        System.out.println(maps.get("生活用品2"));
        //5.根据键删除整个元素（删除键会返回键的值）
        System.out.println(maps.remove("iqqo5pro"));
        System.out.println(maps);
        //6.判断是否包含某个键，包含返回true，反之
        System.out.println(maps.containsKey("哇哇"));
        System.out.println(maps.containsKey("哇哇2"));
        System.out.println(maps.containsKey("iqqo5pro"));

        //7.判断是否包含某个值
        System.out.println(maps.containsValue(100));
        System.out.println(maps.containsValue(10));
        System.out.println(maps.containsValue(1));
        //8.获取全部键的集合:public Set<K> keySet()
        Set<String> keys = maps.keySet();
        System.out.println(keys);

        //9.获取全部值的集合：Collection<V> values();
        Collection<Integer> values = maps.values();
        System.out.println(values);


        //10.集合的大小
        System.out.println(maps.size());

        //11合并其他map集合(拓展)
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("java",1);
        map1.put("java",100);

        Map<String,Integer> map2 = new HashMap<>();
        map1.put("java1",100);
        map1.put("java3",100);
        map1.putAll(map2);
        System.out.println(map1);
        System.out.println(map2);
    }
}
