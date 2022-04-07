package com.wangxh.com.d4.genericity.limit;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * 通配符？
 * 1.？可以在"使用泛型" 的时候代表一切类型
 * 2.E T K V 是在定义泛型的时候用的
 *
 * 泛型的上下限：
 * ? extends Car 必须是Car或者其子类 泛型上限
 * ？super Car 必须是Car或者其父类， 泛型下限
 */
public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        bmws.add(new BMW());
        go(bmws);

        ArrayList<BENZ> benz = new ArrayList<>();
        benz.add(new BENZ());
        benz.add(new BENZ());
        benz.add(new BENZ());
        go(benz);
    }


    /**
     所有车比赛
     */
    public static void go(ArrayList<? extends Car> cars){

    }


}

class BENZ extends Car {
}
class BMW extends Car{
}


//父类
class  Car{}
