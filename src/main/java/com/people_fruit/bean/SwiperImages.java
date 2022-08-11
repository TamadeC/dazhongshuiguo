package com.people_fruit.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.lang.reflect.Type;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
@TableName("swiper_images")
public class SwiperImages {
    @TableId(type = IdType.AUTO)
    private BigInteger sid;
    private String url;
    private String description;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private int isDeleted;

}
