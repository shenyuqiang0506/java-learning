package com.shen.mapper;

import com.shen.entity.Account;
import org.apache.ibatis.annotations.Select;

/**
 * @Author 申宇强
 * @Date 2024/3/14 15:19
 */
public interface UserMapper {
    @Select("select * from user where username = #{username}")
    Account findAccountByName(String username);


}
