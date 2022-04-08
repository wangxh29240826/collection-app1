package com.wangxh.d3.collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 目标：Collection工具类的使用
 *
 * java.utils.Collection工具类的使用
 * Collections并不属于集合，是用来操作集合的工具类
 * Collections有几个常用的API
 *    public Static void<T> boolean addAll(Collection<? super T> c, T... elements)
 *    结合对象批量添加元素
 *    public static void shuffle(List<?> list) : 打乱集合顺序
 *    public static <T> void sort(List<T> list):将集合中元素按照默认规则排序
 *    public static <T> void sort(List<T> list,Comparator<? super T> c):将集合中元素按照指定规则排序
 *
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        Collections.addAll(names,"是正向","有点香啊","是真的香","小");
        System.out.println(names);

//        public static void shuffle(List<?> list) : 打乱集合顺序
        Collections.shuffle(names);
        System.out.println(names);

//        public static <T> void sort(List<T> list):将集合中元素按照默认规则排序 (只能排值特性的元素)
        List<Integer> sets = new ArrayList<>();
        sets.add(23);
        sets.add(3);
        sets.add(3);
        sets.add(20);
        System.out.println(sets);
    }
}
