package com.people_fruit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.people_fruit.bean.GoodsList;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsListMapper extends BaseMapper<GoodsList> {
}
