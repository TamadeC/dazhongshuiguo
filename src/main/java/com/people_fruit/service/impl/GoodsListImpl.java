package com.people_fruit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.people_fruit.bean.GoodsList;
import com.people_fruit.mapper.GoodsListMapper;
import com.people_fruit.service.GoodsListService;
import org.springframework.stereotype.Service;

@Service
public class GoodsListImpl extends ServiceImpl<GoodsListMapper, GoodsList> implements GoodsListService {
}
