package com.jdbc.myjdbc;

/**
 * @Author 申宇强
 * @Date 2023/7/29 1:10
 */
public class MysqlJdbcImpl implements JdbcInterface {
    @Override
    public Object getConnection() {
        System.out.println("得到Mysql连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成 mysql 增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭 mysql 的连接");
    }
}
