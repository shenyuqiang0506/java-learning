package com.shen.mapper;

import com.shen.entity.User;
import org.apache.ibatis.annotations.Select;

/**
 * @Author 申宇强
 * @Date 2024/3/11 17:22
 */

public interface HelloMapper {
    @Select("select * from user where id=#{id}")
    User findUserById(int id);
}
