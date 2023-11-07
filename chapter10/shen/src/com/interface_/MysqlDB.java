package com.interface_;

/**
 * @Author 申宇强
 * @Date 2023/11/7 16:02
 */
public class MysqlDB implements DBInterface {
    @Override
    public void connect() {
        System.out.println("连接mysql");
    }

    @Override
    public void close() {
        System.out.println("关闭mysql");
    }
}
