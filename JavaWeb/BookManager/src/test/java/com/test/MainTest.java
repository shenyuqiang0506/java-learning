package com.test;

import book.manager.sql.SqlUtil;
import org.junit.jupiter.api.Test;

/**
 * @Author 申宇强
 * @Date 2024/1/31 16:58
 */
public class MainTest {
    @Test
    public void test1() {
        SqlUtil.doSqlWork((mapper) -> {
            mapper.getBorrowList().forEach(System.out::println);
        });
    }
    @Test
    public void test2() {
        SqlUtil.doSqlWork((mapper) -> {
            mapper.getBookList().forEach(System.out::println);
        });
    }
    @Test
    public void test3() {
        SqlUtil.doSqlWork((mapper) -> {
            mapper.getStudentList().forEach(System.out::println);
        });
    }
}
