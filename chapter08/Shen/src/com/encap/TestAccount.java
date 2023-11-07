package com.encap;

/**
 * @Author 申宇强
 * @Date 2023/4/20 21:13
 */
public class TestAccount {
    public static void main(String[] args) {
        //创建Account
        Account account = new Account();
        account.setName("Jack");
        account.setBalance(60);
        account.setPwd("123456");

        account.showInfo();
    }
}
