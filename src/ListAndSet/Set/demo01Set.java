package ListAndSet.Set;


import java.util.HashSet;

/*
* hashset存储自定义类型元素
* set集合报错元素唯一：存储的元素（string,Integer,...,student,person）,必须重写Hashcode方法和equals方法
*
* 要求：
*   同名同年龄的人，视为同一个人，只能存储一次
* */
public class demo01Set {
    public static void main(String[] args) {
        //创建Hashset集合存储Person
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("小美女",18);
        Person p2 = new Person("小美女",18);
        Person p3 = new Person("小美女",19);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p1==p2);  //比较地址值
        System.out.println(p1.equals(p2));
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
