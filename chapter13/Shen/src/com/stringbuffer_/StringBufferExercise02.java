package com.stringbuffer_;

import java.util.Scanner;

/**
 * @Author 申宇强
 * @Date 2024/1/9 13:24
 */
public class StringBufferExercise02 {
    public static void main(String[] args) {
        /*
        输入商品名称和商品价格，要求打印效果示例, 使用前面学习的方法完成：
        商品名	商品价格
        手机	123,564.59  //比如 价格 3,456,789.88

        要求：价格的小数点前面每三位用逗号隔开, 在输出。

        思路分析
        1. 定义一个Scanner 对象，接收用户输入的 价格(String)
        2. 希望使用到 StringBuffer的 insert ，需要将 String 转成 StringBuffer
        3. 然后使用相关方法进行字符串的处理
        代码实现
         */
        Scanner scanner = new Scanner(System.in);
        String price = scanner.nextLine();
//        String price = "8123564.59";
        StringBuffer stringBuffer = new StringBuffer(price);
        for (int i = stringBuffer.lastIndexOf(".") - 3; i > 0; i -= 3) {
            stringBuffer = stringBuffer.insert(i, ",");
        }
        System.out.println(stringBuffer);
    }
}
