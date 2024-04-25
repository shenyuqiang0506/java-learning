package com.shen.service.impl;

import com.shen.entity.UserDetails;
import com.shen.mapper.UserDetailsMapper;
import com.shen.service.IUserDetailsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shen
 * @since 2024/4/24
 */
@Service
public class UserDetailsServiceImpl extends ServiceImpl<UserDetailsMapper, UserDetails> implements IUserDetailsService {

}