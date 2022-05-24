package com.example.cn.zhanshiredis.dao;


import com.example.cn.zhanshiredis.entity.NameValue;
import com.example.cn.zhanshiredis.entity.ValueName;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */
@Mapper
@Component("SumMapper")
public interface SumDao {
    @Select("select * from shoppingcart_category")
    List<ValueName> findAllSum();
}
