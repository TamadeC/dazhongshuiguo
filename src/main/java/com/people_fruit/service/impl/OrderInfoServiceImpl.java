package com.people_fruit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.people_fruit.bean.OrderInfo;
import com.people_fruit.mapper.OrderInfoMapper;
import com.people_fruit.service.OrderInfoService;
import org.springframework.stereotype.Service;

@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {
}
