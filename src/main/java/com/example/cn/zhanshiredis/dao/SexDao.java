package com.example.cn.zhanshiredis.dao;


import com.example.cn.zhanshiredis.entity.ChargeNameValue;
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
@Component("SexMapper")
public interface SexDao {
    @Select("select * from query_sex where user_gender=0")
    List<SexNameValue> findAllSex();
}
