package com.shen.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * @Author 申宇强
 * @Date 2024/3/28 9:44
 */
@Data
public class Account {
    @Length(min = 3)   //只需要在对应的字段上添加校验的注解即可
    String username;
    @Length(min = 10)
    String password;
}