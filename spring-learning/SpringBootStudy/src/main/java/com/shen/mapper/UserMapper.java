package com.shen.mapper;

import com.shen.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author 申宇强
 * @Date 2024/3/20 9:41
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where id = #{id}")
    User findUserById(int id);
}