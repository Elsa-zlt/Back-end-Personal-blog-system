package com.Elsa.service.impl;

import com.Elsa.entity.User;
import com.Elsa.mapper.UserMapper;
import com.Elsa.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author：Elsa_zlt
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
