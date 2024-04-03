package com.shen.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shen.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author 申宇强
 * @Date 2024/4/3 16:58
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    //使用方式与JPA极其相似，同样是继承一个基础的模版Mapper
    //这个模版里面提供了预设的大量方法直接使用，跟JPA如出一辙
}
