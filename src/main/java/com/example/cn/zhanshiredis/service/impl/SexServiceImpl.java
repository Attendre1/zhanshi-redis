package com.example.cn.zhanshiredis.service.impl;


import com.example.cn.zhanshiredis.dao.MarketDao;
import com.example.cn.zhanshiredis.dao.SexDao;
import com.example.cn.zhanshiredis.entity.NameValue;
import com.example.cn.zhanshiredis.entity.SexNameValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */
@Service
public class SexServiceImpl implements com.example.cn.zhanshiredis.service.SexService {
    @Autowired
    SexDao sexDao;

    @Override
    public List<SexNameValue> findAllSex() {return sexDao.findAllSex(); }
}
