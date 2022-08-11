package com.people_fruit.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.people_fruit.bean.SwiperImages;
import com.people_fruit.service.SwiperImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("swiper")
public class SwiperImagesController {

    @Autowired
    private SwiperImageService swiperImageService;


//    @GetMapping("test")
//    public void test(){
//        SwiperImages swiperImages=new SwiperImages();
//        swiperImages.setDescription("Dolphin show");
//        swiperImages.setIsDeleted(1);
//        swiperImages.setCreateTime(LocalDateTime.now());
//        swiperImages.setUpdateTime(LocalDateTime.now());
//        swiperImages.setUrl("海豚表演.png");
//        swiperImageService.save(swiperImages);
//    }

    @GetMapping("find")
    public List<SwiperImages> findImages(){
        LambdaQueryWrapper<SwiperImages> queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.orderByDesc(SwiperImages::getCreateTime);
        List<SwiperImages> list = swiperImageService.list(queryWrapper);
        return list;
    }
}
