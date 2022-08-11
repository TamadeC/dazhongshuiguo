package com.people_fruit.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
@TableName("order_info")
public class OrderInfo {
    @TableId(type = IdType.AUTO)
    private BigInteger uid;
    private String username;
    @JsonProperty("userPhone")
    private String phone;
    private String address;
    private String locationName;
    @JsonProperty("message")
    private String message;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    @JsonProperty("goodsIDs")
    private String[] goodsIds;
    @JsonProperty("sumPrice")
    private double orderPrice;
    @JsonProperty("totalGoodsNum")
    private int totalGoods;
    private int status;
}
