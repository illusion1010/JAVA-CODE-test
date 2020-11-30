package ListAndSet.Dome03;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
* HashSet特点
*   1.不允许存储重复元素
*   2.没有索引，没有带索引的方法，也不能使用普通的for循环遍历
*   3.是一个无序的集合，存储元素和取出元素的顺序有可能不一致
*   4.底层是一个哈希表结构（查询速度非常快）
* */

public class demo01Set {
    public static void main(String[] args) {
        //创建set集合，放整数
        Set<Integer> set = new HashSet<>();
        //使用add方法往集合中添加元素
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        //使用迭代器遍历set集合
        Iterator<Integer> it = set.iterator();  //获取一个迭代器
        while (it.hasNext()){
            Integer n = it.next();  //取出元素
            System.out.println(n); //1,2,3  不允许存储重复元素
        }
        //使用增强for遍历set集合
        System.out.println("----------------------------");
        for (Integer i : set) {
            System.out.println(i);
        }


    }
}
