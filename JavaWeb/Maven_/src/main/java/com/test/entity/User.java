package com.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author 申宇强
 * @Date 2024/1/30 20:58
 */
@Data
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String password;
}