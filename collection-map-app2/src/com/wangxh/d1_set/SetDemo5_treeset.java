package com.wangxh.d1_set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet集合默认的规则
 * 1.对于数值类型：integer，Double，官方会默认按照大小进行升序排序
 * 2.对于字符串类型：默认按照首字符的编号升序排序
 * 3.对于自定义类型如students对象，TreeSet无法直接排序
 * 结论：想要使用TreeSet存储自定义类型，需要制定排序规则
 *
 * TreeSet集合存储对象的时候有2种方式可以设计自定义比较规则
 * 方式一
 * 让自定义的类（如学生类）实现Comparable接口重写里面的compareTo方法来制定比较规则
 * 方式二
 * TreeSet集合有参数构造器，可以设置Comparator结构对应的比较器对象，来定制比较规则
 *
 * 两种方式种，关于返回值的规则：
 * 1.如果认为第一个元素大于第二个元素返回正整数即可
 * 2.如果认为第一个元素小于第二个元素返回负整数即可
 * 3.如果如果第一个元素等于第二个元素返回0即可，此时TreeSet集合只会保留一个元素,认为两者重复
 */
public class SetDemo5_treeset {
    public static void main(String[] args) {
        Set<Integer> sets = new TreeSet<>();
        sets.add(23);
        sets.add(20);
        sets.add(216);
        sets.add(290);
        sets.add(13);

        System.out.println(sets);
        Set<String> sets1 = new TreeSet<>();

        sets1.add("java");
        sets1.add("王小桦");
        sets1.add("count");
        sets1.add("about");
        sets1.add("java");
        sets1.add("html");
        System.out.println(sets1);
        System.out.println("-------------------");

        Set<Apple> apples = new TreeSet<>(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
//                return o1.getWeight() - o2.getWeight();

                //调用API如果比较double类型
                return Double.compare(o2.getPrice(),o1.getPrice());

            }
        });
        apples.add(new Apple("红富士","红色",9.9,500));
        apples.add(new Apple("青苹果","绿色",15.9,400));
        apples.add(new Apple("绿苹果","蓝色",29.9,300));
        apples.add(new Apple("黄苹果","黄色",9.8,500));
        System.out.println(apples);
    }

    /**
     * 1.如果希望元素可以重复，又有索引，索引查询要快就用ArrayList集合，基于数组的
     * 2.如果希望元素可以重复，又有索引，增删首位操作快用LinkedList集合，基于链表的
     * 3.如果希望增删改查都快，但是元素不重复，无序，无索引 用HashSet基于哈希表的
     * 4.如果希望增删改查都快，但是元素不重复，有序，无索引 用LinkedHashSet集合基于哈希表和双链表的
     * 5.如果要对对象进行排序 用TreeSet集合，基于红黑树。后续也可以用List集合实现排序
     */
}
