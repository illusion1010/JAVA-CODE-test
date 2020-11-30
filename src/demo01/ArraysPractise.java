package demo01;

import java.util.Arrays;

/*
题目：使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印
 */
public class ArraysPractise {
    public static void main(String[] args) {
        String str = "djadjah63djadaiqweiq";

        //升序排列：sort
        //数组：才能用Arrays.sort方法
        //String -->数组，用toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars); //对字符数组升序排列

        //倒序遍历
        //chars.fori 正序
        //chars.forr 倒序

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);

        }

    }
}
