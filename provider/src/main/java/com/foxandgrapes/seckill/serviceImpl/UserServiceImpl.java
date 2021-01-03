package com.foxandgrapes.seckill.serviceImpl;

import com.foxandgrapes.seckill.pojo.User;
import com.foxandgrapes.seckill.mapper.UserMapper;
import com.foxandgrapes.seckill.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tsk
 * @since 2021-01-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
