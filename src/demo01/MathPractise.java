package demo01;
/*
题目：计算-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？

分析：
1.确定范围，for循环
2.起点位置-10.8转换成-10：强转成int，自动舍弃所有小数位
3.每个数字都是整数，步进表达式num++
4.取绝对值：Math.abs方法
5.发现数字，计数器++
 */
public class MathPractise {
    public static void main(String[] args) {
        int cout = 0;//符合要求的数量

        double min = -10.8;
        double max = 5.9;
        //变量i就是区间之内所有的整数；
//        for (int i = (int)min; i < max; i++) {
//            int abs = Math.abs(i);//绝对值
//            if(abs > 6 || abs < 2.1){
//                System.out.println(i);
//                count++;
//            }
//
//        }
//        System.out.println("总共有："+count);//9
    }
}
