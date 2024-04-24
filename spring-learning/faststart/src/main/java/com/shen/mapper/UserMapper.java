package com.shen.mapper;

import com.shen.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author shen
 * @since 2024/4/24
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
