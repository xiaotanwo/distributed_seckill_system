package com.foxandgrapes.seckill.serviceImpl;

import com.foxandgrapes.seckill.pojo.Goods;
import com.foxandgrapes.seckill.mapper.GoodsMapper;
import com.foxandgrapes.seckill.service.IGoodsService;
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
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

}
