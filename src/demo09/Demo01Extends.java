package demo09;

/*
继承关系：子类就是一个父类
eg：父类是员工，子类是讲师，那么“讲师就是一个员工”，关系：is-a

定义父类的格式（普通类）
public class 父类名称{
  //...}

  定义子类格式
  public class 子类名称 extends 父类名称{
  //...
  }
 */
public class Demo01Extends {
    public static void main(String[] args) {
        //创建一个子类对象
        Teacher teacher = new Teacher();
        //Teacher类中虽然什么都没写，但会继承来自父类的method方法
        teacher.method();

        //创建另外一个子类助教的对象
        Assistant assistant = new Assistant();
        assistant.method();
    }
}
