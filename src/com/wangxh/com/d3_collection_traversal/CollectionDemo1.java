package com.wangxh.com.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("小王");
        lists.add("小红");
        lists.add("小易");
        System.out.println(lists);

        //1.得到当前集合的迭代器对象
        Iterator<String> it = lists.iterator();
        String ele = it.next();
        System.out.println(ele);
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println("-----------");
//        System.out.println(it.next()); //这里会报错
        //2.定义while循环
        while (it.hasNext()){
            String ele1 = it.next();
            System.out.println(ele1);
        }
        System.out.println("-------------------------");
        /**
         * 总结
         * 1.迭代器默认位置在Iterator<E> iterator():得到迭代器对象
         * 2.迭代器如果取元素越界会出现NoSuchElementException异常
         */
    }
}
