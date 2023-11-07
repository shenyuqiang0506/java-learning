package com.jdbc.datasource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @Author 申宇强
 * @Date 2023/8/3 16:07
 * 基于druid数据库连接池的工具类
 */
@SuppressWarnings({"all"})
public class JDBCUtilsByDruid {
    private static DataSource dataSource;

    //
    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("druid.properties"));
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //编写getConnection方法
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    //关闭连接
    public static void close(ResultSet resultSet, Statement statement, Connection connection) {
        // 关闭结果集
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
