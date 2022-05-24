package com.example.cn.zhanshiredis.dao;


import com.example.cn.zhanshiredis.entity.SellNameValue;
import com.example.cn.zhanshiredis.entity.SexNameValue;
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
@Component("SellMapper")
public interface SellDao {
    @Select("select * from query_sex where user_gender=1")
    List<SellNameValue> findAllSell();
}
