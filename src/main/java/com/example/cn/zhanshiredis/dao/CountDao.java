package com.example.cn.zhanshiredis.dao;


import com.example.cn.zhanshiredis.entity.CountValueName;
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
@Component("CountMapper")
public interface CountDao {
    @Select("select * from shoppingcart_view")
    List<CountValueName> findAllCount();
}
