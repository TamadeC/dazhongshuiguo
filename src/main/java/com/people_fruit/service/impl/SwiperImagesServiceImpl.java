package com.people_fruit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.people_fruit.bean.SwiperImages;
import com.people_fruit.mapper.SwiperImagesMapper;
import com.people_fruit.service.SwiperImageService;
import org.springframework.stereotype.Service;

@Service
public class SwiperImagesServiceImpl extends ServiceImpl<SwiperImagesMapper, SwiperImages> implements SwiperImageService {
}
