package com.foxandgrapes.seckill.serviceImpl;

import com.foxandgrapes.seckill.pojo.Order;
import com.foxandgrapes.seckill.mapper.OrderMapper;
import com.foxandgrapes.seckill.service.IOrderService;
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
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
