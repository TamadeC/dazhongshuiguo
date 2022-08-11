package com.people_fruit.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.people_fruit.bean.CategoriesFruit;
import com.people_fruit.mapper.CategoryFruitMapper;
import com.people_fruit.service.CategoryFruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryFruitController {
    @Autowired
    private CategoryFruitService categoryFruitService;


    @RequestMapping("test")
    public CategoriesFruit test(){
        CategoriesFruit categoriesFruit=new CategoriesFruit();
        categoriesFruit.setCatName("海南2");
        categoriesFruit.setUpdateTime(LocalDateTime.now());
        categoriesFruit.setCreateTime(LocalDateTime.now());
        categoriesFruit.setCatStatus("1000");
        categoriesFruit.setIsDeleted(1);
        System.out.println(categoriesFruit);
        categoryFruitService.save(categoriesFruit);
        return categoriesFruit;
    }

    @GetMapping("findAll")
    public List<CategoriesFruit> findAll(){
        QueryWrapper<CategoriesFruit> queryWrapper=new QueryWrapper<>();
//        queryWrapper.select("cat_id","cat_name");
        List<CategoriesFruit> list = categoryFruitService.list(queryWrapper);
        return list;
    }
}
