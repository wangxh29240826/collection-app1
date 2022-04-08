package com.wangxh.d2_params;


import java.util.Arrays;

/**
 *
 *可变参数的作用：
 * 传输参数非常灵活，方便
 * 可以传输一个参数
 * 可以传输多个参数
 * 可以传输一个数组
 *
 * 可变参数在方法内部本质上就是一个数组
 * 可变参数的注意事项：
 * 1.一个形参列表中可变参数只能有一个
 * 2.可变此参数必须放形参列表最后面
 *
 */
public class MethodDemo {
    public static void main(String[] args) {
        sum();//1
        sum(10);//2
        sum(10,20,30);//3
        sum(new int[] {10,20,30});//4
    }

    //格式：数据类型...参数名称
    public static void sum(int...nums){
        //注意：可变参数在方法内部其实就是一个数组 nums
        System.out.println("元素个数:" + nums.length);
        System.out.println("元素个数:" + Arrays.toString(nums));
    }
}
