package com.jdbc.datasource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.List;

/**
 * @Author 申宇强
 * @Date 2023/8/4 13:25
 */
@SuppressWarnings({"all"})
public class DBUtils_USE {
    @Test
    //使用apache-DBUtils 工具类 + druid 完成对表的crud操作
    public void testQueryMany() throws Exception {//返回结果是多行的情况
        //1. 得到 连接 (druid)
        Connection connection = JDBCUtilsByDruid.getConnection();
        //2.使用DBUtils类和接口
        //3.创建一个QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        //4.QueryRunner就可以执行相关的方法
        // 解读
        //(1) query 方法就是执行sql 语句，得到resultset ---封装到 --> ArrayList 集合中
        //(2) 返回集合
        //(3) connection: 连接
        //(4) sql : 执行的sql语句
        //(5) new BeanListHandler<>(Actor.class): 在将resultset -> Actor 对象 -> 封装到 ArrayList
        //    底层使用反射机制 去获取Actor 类的属性，然后进行封装
        //(6) 1 就是给 sql 语句中的? 赋值，可以有多个值，因为是可变参数Object... params
        //(7) 底层得到的resultset ,会在query 关闭, 关闭PreparedStatment
        String sql = "select * from actor where id>=?";
        String sql2 = "select id,name from actor where id>=?";
        List<Actor> list =
                queryRunner.query(connection, sql2, new BeanListHandler<>(Actor.class), 1);
        System.out.println("输出集合结果");
        for (Actor actor : list) {
            System.out.println(actor);
        }
        //关闭资源
        JDBCUtilsByDruid.close(null, null, connection);
    }

    //演示apache-DBUtils 工具类 + druid 返回的结果是单行数据
    @Test
    public void testQuerySingle() throws Exception {
        //1. 得到 连接 (druid)
        Connection connection = JDBCUtilsByDruid.getConnection();
        //2.使用DBUtils类和接口
        //3.创建一个QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        //4. 就可以执行相关的方法，返回单个对象
        // 解读
        // 因为我们返回的单行记录<--->单个对象 , 使用的Hander 是 BeanHandler
        String sql = "select * from actor where id = ?";
        Actor actor = queryRunner.query(connection, sql, new BeanHandler<>(Actor.class), 1);
        System.out.println("输出单个对象结果");
        System.out.println(actor);
        // 释放资源
        JDBCUtilsByDruid.close(null, null, connection);
    }

    //演示apache-dbutils + druid 完成查询结果是单行单列-返回的就是object
    @Test
    public void testScalar() throws Exception {
        //1. 得到 连接 (druid)
        Connection connection = JDBCUtilsByDruid.getConnection();
        //2.使用DBUtils类和接口
        //3.创建一个QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        //4. 就可以执行相关的方法，返回单行单列 , 返回的就是Object
        String sql = "select name from actor where id = ?";
        //老师解读： 因为返回的是一个对象, 使用的handler 就是 ScalarHandler
        Object object = queryRunner.query(connection, sql, new ScalarHandler(), 1);
        System.out.println(object);
        // 释放资源
        JDBCUtilsByDruid.close(null, null, connection);
    }

    //演示apache-dbutils + druid 完成 dml (update, insert ,delete)
    @Test
    public void testDML() throws Exception {
        //1. 得到 连接 (druid)
        Connection connection = JDBCUtilsByDruid.getConnection();
        //2.使用DBUtils类和接口
        //3.创建一个QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        //4. 这里组织sql 完成 update, insert delete
        String sql1 = "update actor set name = ? where id = ?";
        String sql2 = "insert into actor values(null, ?, ?, ?, ?)";
        String sql3 = "delete from actor where id = ?";
        //解读
        //(1) 执行dml 操作是 queryRunner.update()
        //(2) 返回的值是受影响的行数 (affected: 受影响)
        int affectedRow = queryRunner.update(connection, sql1, "申宇强 ", 1);
        int update = queryRunner.update(connection, sql2, "shen", "男", "2003-05-06", "15345579277");
        int delete = queryRunner.update(connection, sql3, 3);
        System.out.println(update > 0 ? "执行成功" : "执行没有影响到表");
        System.out.println(affectedRow > 0 ? "执行成功" : "执行没有影响到表");
        System.out.println(delete > 0 ? "执行成功" : "执行没有影响到表");


        // 释放资源
        JDBCUtilsByDruid.close(null, null, connection);
    }
}
