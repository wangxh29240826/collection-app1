package com.wangxh.d1_set;

public class SetDemo2 {
    public static void main(String[] args) {
        //目标：学会获取对象的哈希值，并确认一下
        String name = "wangxh";
        System.out.println(name.hashCode());
        System.out.println(name.hashCode());
        System.out.println(name.hashCode());

        String name1 = "wangxh1";
        System.out.println(name1.hashCode());
        System.out.println(name1.hashCode());
        System.out.println(name1.hashCode());


        /**
         * 哈希值
         * 1.是jdk根据对象的地址，按照某种规则算出来的int类型的数值
         * Object类型的API
         * public int hashCode() 返回对象的哈希值
         *
         * 对象的哈希值特点
         *同一个对象多次调用hashCode（）方法返回的哈希值是相同的
         * 默认情况下，不同的哈希值是不同的
         */

        /**
         * 1.Set集合的底层原理是什么样的
         * JDk8之前的，哈希表：底层使用数组+链表组成
         * JKK8之后，哈希表：底层采用数组+链表+红黑树组成    一但悬着的数超过8之后转红黑树
         *2.哈希表的详细流程
         * -1.创建一个默认长度16，默认加载因为0.75的数组，数组名table
         * -2.根据元素的哈希值跟数组的长度计算应存入的位置
         * -3.判断当前位置是否为null，如果是null直接存入，如果位置部位null，表示有元素，则调用equals方法比较属性值，如果一样，则不存，如果不一样，则存入数组
         * -4.当数组存满到16*0.75=12时，就自动扩容，每次从扩容原先的两倍
         *
         *
         */
    }
}
