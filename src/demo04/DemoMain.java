package demo04;

public class DemoMain {

    public static void main(String[] args) {
        //首先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();
        System.out.println("====================");


        //准备一个鼠标，供电脑使用
//        Mouse mouse = new Mouse();
        //首先进行向上转型
        USB usbMouse = new Mouse(); //左父右子 ,左接口 右实现类   =====多态写法
        //参数是USB类型，正好传递进去的是USB鼠标
        computer.usbDevice(usbMouse);

        System.out.println("====================");

        //创建一个USB键盘
        Keyboard keyboard = new Keyboard();//没有使用多态写法
        //方法参数是USB类型，传递进去的就是实现类对象
        computer.usbDevice(keyboard); //正确写法

        System.out.println("====================");
        computer.usbDevice(new Keyboard()); //也是正确写法

        computer.powerOff();

        System.out.println("====================");

        method(10.0); //double -->double
        method(10); //int --->double
        //基本数据类型举例
        int a = 30;
        method(a); //int --->double
    }

    public static void method(double num){
        System.out.println(num);
    }
}
