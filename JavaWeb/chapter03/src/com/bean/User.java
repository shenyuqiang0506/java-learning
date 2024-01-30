package com.bean;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author 申宇强
 * @Date 2024/1/28 18:08
 */
@Data
@Accessors(chain = true)
public class User {
    private int id;
    private String name;
    private String password;
}
