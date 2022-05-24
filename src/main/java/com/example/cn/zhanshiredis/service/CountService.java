package com.example.cn.zhanshiredis.service;


import com.example.cn.zhanshiredis.entity.CountValueName;
import com.example.cn.zhanshiredis.entity.ValueName;

import java.util.List;

/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */

public interface CountService {
    //从数据库中获取数据
    List<CountValueName> findAllCount();
}
