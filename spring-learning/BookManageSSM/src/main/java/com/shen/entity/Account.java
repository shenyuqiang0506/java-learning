package com.shen.entity;

import lombok.Data;

/**
 * @Author 申宇强
 * @Date 2024/3/16 15:34
 */
@Data
public class Account {
    int sid;
    String username;
    String password;
    String role;
}
