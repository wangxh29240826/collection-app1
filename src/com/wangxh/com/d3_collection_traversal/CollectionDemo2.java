package com.wangxh.com.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("小易");
        lists.add("小王");
        lists.add("我喜欢");
        System.out.println(lists);

//        lists.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        //简化lamdam写法
        lists.forEach(s ->System.out.println(s));
    }
}
