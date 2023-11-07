package com.jdbc.myjdbc;

/**
 * @Author 申宇强
 * @Date 2023/7/29 1:13
 */
public class TestJDBC {
    public static void main(String[] args) {
        //完成对MySQL的操作
        JdbcInterface jdbcInterface = new MysqlJdbcImpl();
        jdbcInterface.getConnection();//通过接口调用实现类
        jdbcInterface.crud();
        jdbcInterface.close();


        //完成对oracle的操作
        System.out.println("===============");
        jdbcInterface  = new OracleJdbcImpl();
        jdbcInterface.getConnection();//通过接口调用实现类
        jdbcInterface.crud();
        jdbcInterface.close();
    }
}
