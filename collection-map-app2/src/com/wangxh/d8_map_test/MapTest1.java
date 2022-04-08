package com.wangxh.d8_map_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapTest1 {
    public static void main(String[] args) {
        //1.把800个学生选择的数据拿进来
        String[] selects = {"A","B","C","D"};
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            sb.append(selects[r.nextInt(selects.length)]);
        }
        System.out.println(sb);

        //2.定义一个Map集合记录最终统计的结果:A = 30,B=20 C=2 D=10
        Map<Character,Integer> infos = new HashMap<>();
        //3.遍历80个学生选择的数据
        for (int i = 0; i < sb.length(); i++) {
            //4.提取当前选择景点字符
            char ch = sb.charAt(i);
            //5.判断Map结合是否存在
            if (infos.containsKey(ch)){
                //其值加1
                infos.put(ch,infos.get(ch) + 1);
            }else {
                //说明此景点是第一次被选择s
                infos.put(ch ,1);
            }
        }
        //4.输出集合
        System.out.println(infos);
    }
}
