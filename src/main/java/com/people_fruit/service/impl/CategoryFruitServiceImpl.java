package com.people_fruit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.people_fruit.bean.CategoriesFruit;
import com.people_fruit.mapper.CategoryFruitMapper;
import com.people_fruit.service.CategoryFruitService;
import org.springframework.stereotype.Service;

@Service
public class CategoryFruitServiceImpl extends ServiceImpl<CategoryFruitMapper, CategoriesFruit> implements CategoryFruitService {
}
