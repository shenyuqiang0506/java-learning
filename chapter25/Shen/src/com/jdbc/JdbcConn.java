package com.jdbc;

import com.mysql.cj.jdbc.Driver;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Author 申宇强
 * @Date 2023/7/26 21:17
 * 分析 java 连接 mysql 的 5 中方式
 */
//方式1
public class JdbcConn {
    public void connect01() throws SQLException {
        Driver driver = new Driver();
        String url = "jdbc:mysql://localhost:3306/shen_db02?useSSL=true&useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai";
        //将 用户名和密码放入到Properties 对象
        Properties properties = new Properties();
        //说明 user 和 password 是规定好，后面的值根据实际情况写
        properties.setProperty("user", "root");
        properties.setProperty("password", "123456");
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);
    }

}
