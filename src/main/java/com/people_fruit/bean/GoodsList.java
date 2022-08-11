package com.people_fruit.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
@TableName("goods_list")
public class GoodsList {
    @TableId(type = IdType.AUTO)
    private BigInteger gid;
    private String title;
    private String description;
    private double price;
    private double originPrice;
    private int buyNum;
    private String photo;
    private LocalDateTime updateTime;
    private LocalDateTime createTime;
    private int isDeleted;
    private BigInteger cat_id;

}
