package com.shen.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author 申宇强
 * @Date 2024/3/16 15:36
 */
@Data
public class Borrow {
    int id;
    int sid;
    int bid;
    Date time;
    String bookName;
    String studentName;
}
