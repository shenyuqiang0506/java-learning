package com.jdbc.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @Author 申宇强
 * @Date 2023/8/3 15:46
 * 测试druid的使用
 */
@SuppressWarnings({"all"})
public class Druid_ {
    @Test
    public void testDruid() throws Exception {
        //1. 加入 Druid jar包
        //2. 加入 配置文件 druid.properties , 将该文件拷贝项目的src目录
        //3. 创建Properties对象, 读取配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("druid.properties"));

        //4. 创建一个指定参数的数据库连接池, Druid连接池
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        long strat = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
            Connection connection = dataSource.getConnection();
            //System.out.println("连接成功");
            connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println("Druid 使用 " + (end - strat) + " ms");//Druid 使用 1444 ms
    }
}
