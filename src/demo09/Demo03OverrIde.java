package demo09;

/*
重写（override）
概念：在继承关系中，方法的名称一样，参数列表也一样；

重写（override）：方法经常一样，参数列表【也一样】；覆盖、覆写
重载（overload）：方法的名称一样，参数列表【不一样】；

方法的覆盖重写：1.父子类之间方法名称相同，参数列表也相同
            @Override：写在方法前面，可检测是不是有效的正确的覆盖重写
            2.子类方法的返回值必须小于等于方法的返回值范围；
    前提： Object类是所有类的公共最高父类；java.lang.String就是Object的子类
            3.子类方法的权限必须【大于等于】父类方法的权限修饰符；
     提示：     public > protected >(default) > private
     PS：default 不是关键字default，而是生命都不写，留空
 */
public class Demo03OverrIde {
}
