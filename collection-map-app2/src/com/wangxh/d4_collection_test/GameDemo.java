package com.wangxh.d4_collection_test;

import java.util.*;

/**
 * 需求：
 * 在启动游戏房间的时候，应该提前准备好54张牌，完成洗牌，发牌，牌排序
 * 分析：
 * 1：当系统启动的同时需要准备好数据的时候，就可以用静态代码块了
 * 2.洗牌就是打乱牌的排序
 * 3.定义三个玩家，依次发出51张牌
 * 4.给玩家的牌进行排序（拓展）
 * 5.输出每个玩家的牌数据
 */
public class GameDemo {

    /**
     * 1.定义一个静态的集合存储54张牌
     */
    public static List<Card> allCards = new ArrayList<>();

    /**
     * 2.做牌：定义静态代码块初始化牌数据
     */
    static {
        //3.定义点数：个数确定，类型确定，使用数组
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //4.定义花色：个数确定，类型确定，使用数组
        String[] colors = {"♠", "♥", "🔷", "◼"};
        //5.组合点数和花色
        int index = 0;//记录牌的大小
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                //6.封装成一个牌对象
                Card c = new Card(size, color, index);
                //7.存入到集合容器中去
                allCards.add(c);
            }
        }
        //大小王存入到集合中去
        Card c1 = new Card("", "🃏", ++index);
        Card c2 = new Card("", "👲", ++index);
        Collections.addAll(allCards, c1, c2);
        System.out.println("新牌" + allCards);
    }

    public static void main(String[] args) {
        //9.洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后" + allCards);

        //10.发牌（定义三个玩家，每个玩家的牌也是一个集合容器）
        List<Card> xiaowang = new ArrayList<>();
        List<Card> yiwenqi = new ArrayList<>();
        List<Card> lanbing = new ArrayList<>();

        //11.开始发牌（从牌集合中发出51张牌给三个玩家，剩余做底牌）

        for (int i = 0; i < allCards.size() - 3; i++) {
            //先拿到当前牌对象
            Card c = allCards.get(i);
            if (i % 3 == 0) {
                //请小王
                xiaowang.add(c);
            } else if (i % 3 == 1) {
                //请易雯琪
                yiwenqi.add(c);
            } else if (i % 3 == 2) {
                //请兰冰
                lanbing.add(c);
            }
        }

        //12.拿到3张底牌（把最后三张牌截取成一个集合）
        List<Card> lastThreeCards = allCards.subList(allCards.size() - 3, allCards.size());

        //13给玩家的牌排序（）从大到小
        sortCars(xiaowang);
        sortCars(yiwenqi);
        sortCars(lanbing);


        //14,输出玩家的牌
        System.out.println("小王：" + xiaowang);
        System.out.println("易雯琪：" + yiwenqi);
        System.out.println("兰冰：" + lanbing);
        System.out.println("三张底牌：" + lastThreeCards);

    }

    private static void sortCars(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getIndex() - o1.getIndex();
            }
        });
    }
}
