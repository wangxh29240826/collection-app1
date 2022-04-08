package com.wangxh.d1_set;

import java.util.HashSet;
import java.util.Set;

/**
 * 目标：让Set集合把重复内容的对象去掉一个（去重复）
 */

public class SetDemo3 {
    public static void main(String[] args) {

        //Set集合去重复原因：先判断哈希值  再判断equals
        Set<Student> sets = new HashSet<>();


        Student s1 = new Student("小王",20,'男');
        Student s2 = new Student("小易",18,'女');
        Student s3 = new Student("小王",20,'男');

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        System.out.println("-------------------");
        sets.add(s1);
        sets.add(s2);
        sets.add(s3);


        System.out.println(sets);

        /**
         * 总结
         * 如果希望Set集合认为2个内容相同的对象时重复的应该怎么办
         * 1-重写对象的 hashCode 和 equals方法
         */
    }
}
