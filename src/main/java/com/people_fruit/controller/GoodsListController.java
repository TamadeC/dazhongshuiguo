package com.people_fruit.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.people_fruit.bean.GoodsList;
import com.people_fruit.mapper.GoodsListMapper;
import com.people_fruit.service.GoodsListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("goods")
public class GoodsListController {

    @Autowired
    private GoodsListService goodsListService;

    @RequestMapping("test")
    public GoodsList add(){
        GoodsList goodsList=new GoodsList();
        goodsList.setTitle("雪梨");
        goodsList.setDescription("好吃的苹果");
        goodsList.setPrice(18.3);
        goodsList.setOriginPrice(30);
        goodsList.setBuyNum(1200);
        goodsList.setCreateTime(LocalDateTime.now());
        goodsList.setUpdateTime(LocalDateTime.now());
        goodsList.setPhoto("R-C.jpg");
        goodsList.setCat_id(BigInteger.valueOf(18));
        goodsListService.save(goodsList);
        return goodsList;
    }

    @GetMapping("findAll")
    public List<GoodsList> getGoodsList(){
        LambdaQueryWrapper<GoodsList> queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.orderByAsc(GoodsList::getCreateTime);
        List<GoodsList> list = goodsListService.list(queryWrapper);
        return list;
    }

    @PostMapping("get")
    public List<GoodsList> getList(@RequestBody String ids){
        String decode = null;
        try {
            decode = URLDecoder.decode(ids,"UTF-8");

            String substring = decode.substring(4);
            List<String> strings = Arrays.asList(substring.split(","));
            List<GoodsList> list = new ArrayList<>();
            LambdaQueryWrapper<GoodsList> queryWrapper=new LambdaQueryWrapper<>();
            for (int i = 0; i < strings.size(); i++) {

                GoodsList goods = goodsListService.getById(strings.get(i));
                list.add(goods);

            }
            System.out.println(list);
            return list;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

    }
}
