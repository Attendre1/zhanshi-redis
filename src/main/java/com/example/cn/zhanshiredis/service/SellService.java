package com.example.cn.zhanshiredis.service;


import com.example.cn.zhanshiredis.entity.SellNameValue;
import com.example.cn.zhanshiredis.entity.SexNameValue;

import java.util.List;

/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */

public interface SellService {
    //从数据库中获取数据
    List<SellNameValue> findAllSell();
}
