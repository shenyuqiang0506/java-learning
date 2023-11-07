package com.jdbc.myjdbc;

/**
 * @Author 申宇强
 * @Date 2023/7/29 1:12
 * 模拟 oracle 数据库实现 jdbc
 */
public class OracleJdbcImpl implements JdbcInterface{
    public OracleJdbcImpl() {
        super();
    }

    @Override
    public Object getConnection() {
        System.out.println("得到 oracle 的连接 升级");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成 对 oracle 的增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭 oracle 的连接");
    }
}
