package com.test.mapper;
import com.test.entity.User;
import org.apache.ibatis.annotations.Select;

/**
 * @Author 申宇强
 * @Date 2024/1/30 20:57
 */
public interface TestMapper {
    @Select("select * from user where id =#{id}")
    public User getUserById(int id);
}
