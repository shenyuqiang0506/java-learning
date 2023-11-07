package com.demo;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author 申宇强
 * @Date 2023/7/12 21:01
 */
public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要猜的数(1-100)：");
        while (true) {
            int a = scanner.nextInt();
            if (a <= 0 || a > 100) {
                System.out.println("输入错误");
            } else if (a > number) {
                System.out.println("这个数大了");
            } else if (a < number) {
                System.out.println("这个数小了");
            } else {
                System.out.println("恭喜你回答正确");
                break;
            }
        }
    }
}
