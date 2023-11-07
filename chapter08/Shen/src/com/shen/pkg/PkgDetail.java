/*package 的作用是声明当前类所在的包，需要放在类的最上面，
一个类中最多只有一句package*/
package com.shen.pkg;
//import指令 位置放在package的下面，在类定义前面,可以有多句且没有顺序要求
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author 申宇强
 * @Date 2023/4/15 10:35
 */
public class PkgDetail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr= {-1,0,2};
        Arrays.sort(args);
    }
}


