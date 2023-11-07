package com.shen.pkg;

import java.util.Arrays;
//注意:
//建议：我们需要使用到哪个类，就导入哪个类即可，不建议使用 *导入
//import java.util.Scanner;//表示只引入Scanner
//import java.util.*;//表示将 java.util 包下的所有类都引入(导入)

/**
 * @Author 申宇强
 * @Date 2023/4/15 10:23
 */
public class Import01 {
    public static void main(String[] args) {
        //使用系统提供 Arrays  完成 数组排序
        int[] arr = {1, 20, 3, 5, 7, 9, 11};
        //比如对其进行排序
        //传统方法是，自己编写排序(冒泡)
        //系统是提供了相关的类，可以方便完成 Arrays
        Arrays.sort(arr);
        //输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
