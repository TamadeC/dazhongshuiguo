package com.people_fruit.bean;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
@TableName("categories_fruit")
public class CategoriesFruit {
    @TableId(type = IdType.AUTO)
    private BigInteger catId;

    private String catName;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String catStatus;
    private int isDeleted;

}
