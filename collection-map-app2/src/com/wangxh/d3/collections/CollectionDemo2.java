package com.wangxh.d3.collections;

import com.wangxh.d1_set.Apple;

import java.util.*;

public class CollectionDemo2 {
    public static void main(String[] args) {
        //排序方式一 apple类已经重写了比较规则
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("红富士","红色",9.9,500));
        apples.add(new Apple("青苹果","绿色",15.9,400));
        apples.add(new Apple("绿苹果","蓝色",29.9,300));
        apples.add(new Apple("黄苹果","黄色",9.8,500));

        Collections.sort(apples);//可以实现排序
        System.out.println(apples);
        System.out.println("----------------------------");

        //排序方式二:sort方法自带比较器对象
        Collections.sort(apples, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
        //正则表达式简写
        //Collections.sort(apples, (o1, o2)-> Double.compare(o1.getPrice(), o2.getPrice()));;

    }
}
