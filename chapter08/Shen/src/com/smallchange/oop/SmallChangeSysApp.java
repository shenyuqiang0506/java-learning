package com.smallchange.oop;

/**
 * @Author 申宇强
 * @Date 2023/6/28 21:59
 */
//这里我们直接调用SmallChangeSysOOP 对象，显示主菜单即可
public class SmallChangeSysApp {
    public static void main(String[] args) {
        System.out.println("====shen公司====");
        new SmallChangeSysOOP().mainMenu();
    }
}
