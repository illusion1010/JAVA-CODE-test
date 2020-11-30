package demo02;
/*
抽象方法：加上abstract关键字，去掉大括号，直接分号结束；
抽象类：class之前写abstract即可。抽象方法所在的类，必须是抽象类；

如何使用抽象类和抽象方法：
1。不能直接创建new抽象类对象；
2.必须用一个子类来继承抽象父类；
3.子类必须覆盖重写父类中所有的抽象方法；
    覆盖重写（实现）：子类去掉抽象方法的abstract关键字，然后不上方法体大括号；
4.创建子类对象使用
 */
public abstract class Animal {
    //这是一个抽象方法，代表吃东西，但具体吃什么（大括号的内容）不确定
    public abstract void eat();

    //这是普通的成员方法
    public void normalMethod(){

    }
}
