package com.example.cn.zhanshiredis.service.impl;


import com.example.cn.zhanshiredis.dao.MarketDao;
import com.example.cn.zhanshiredis.entity.NameValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */
@Service
public class MarketServiceImpl implements com.example.cn.zhanshiredis.service.MarketService {
    @Autowired
    MarketDao marketDao;

    @Override
    public List<NameValue> findAllMarket() {return marketDao.findAllMarket(); }
}
