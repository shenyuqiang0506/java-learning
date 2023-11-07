package com.jdbc.resulset_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @Author 申宇强
 * @Date 2023/7/31 14:19
 * 演示select 语句返回 ResultSet ,并取出结果
 */
@SuppressWarnings({"all"})
public class ResultSet_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        //通过Properties对象获取配置文件的信息

        Properties properties = new Properties();
        properties.load(new FileInputStream("mysql.properties"));
        //获取相关的值
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");

        //1. 注册驱动
        Class.forName(driver);//建议写上

        //2. 得到连接
        Connection connection = DriverManager.getConnection(url, user, password);
        //3.得到Statement
        Statement statement = connection.createStatement();
        //4.组织SQL语句
        String sql = "select id,name,sex,borndate from actor";
        ResultSet resultSet = statement.executeQuery(sql);

        //5.使用while取出
        while (resultSet.next()) {// 让光标向后移动，如果没有更多行，则返回false
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String sex = resultSet.getString(3);
            Date date = resultSet.getDate(4);
            System.out.println(id + "\t" + name + "\t" + sex + "\t" + date);
        }
        //6.关闭资源
        resultSet.close();
        statement.close();
        connection.close();

    }
}
