package com.shen.javamysql;

import java.sql.*;

/**
 * @Author 申宇强
 * @Date 2023/6/30 15:08
 */
@SuppressWarnings({"all"})
public class JavaMysql {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //java 程序如何操作Mysql
        //加载类，得到mysql连接
        String jdbcUrl = "jdbc:mysql://localhost:3306/goods?useSSL=true&useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai";
        String userName = "root";
        String password = "123456";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
        //创建一个商品hsp_goods表, 选用适当的数据类型
        //添加2条数据
        //删除表goods
        //这里可以编写sql 【create , select , insert , update ,delete ...】
        //String sql = "create table goods (id int,name varchar(32),price double, introduce text)";
        //String sql = "insert into goods values (1,'小米手机',2000, '这是不错的一款手机')";
        String sql = "drop table goods ";
        //得到statement对象，把sql 语法发送给mysql执行
        Statement statement = connection.createStatement();
        statement.execute(sql);
        //关闭连接
        statement.close();
        connection.close();
        System.out.println("成功~");
    }
}
