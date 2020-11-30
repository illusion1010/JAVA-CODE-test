package demo09;
/*
局部变量 ：   直接写成员变量名
本类的成员变量 ：this.成员变量名
父类的成员变量：super.成员变量名

PS:成员方法或成员变量，都是向上找父类，不会向下找子类；


 */
public class Demo02ExtendsField {
    public static void main(String[] args) {
        Zi02 zi = new Zi02();
        zi.method();
    }
}
