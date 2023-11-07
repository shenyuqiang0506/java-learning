package com.jdbc.utils;

import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Author 申宇强
 * @Date 2023/7/31 15:51
 * 该类演示如何使用JDBCUtils工具类，完成dml 和 select
 */
public class JDBCUtils_User {

    public void testDML(){
        //1.得到连接
        Connection connection = null;
        //2.组织一个 sql语句
        String sql = "update actor set name = ? where id = ?";
        PreparedStatement preparedStatement = null;
        //3.
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement= connection.prepareStatement(sql);
            //赋值
            preparedStatement.setString(1,"星驰");
            preparedStatement.setInt(2, 4);
            //执行
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            JDBCUtils.close(null,preparedStatement,connection);
        }
    }
}
