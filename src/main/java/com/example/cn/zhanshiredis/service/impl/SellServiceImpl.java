package com.example.cn.zhanshiredis.service.impl;


import com.example.cn.zhanshiredis.dao.SellDao;
import com.example.cn.zhanshiredis.dao.SexDao;
import com.example.cn.zhanshiredis.entity.SellNameValue;
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
public class SellServiceImpl implements com.example.cn.zhanshiredis.service.SellService {
    @Autowired
    SellDao sellDao;

    @Override
    public List<SellNameValue> findAllSell() {return sellDao.findAllSell(); }
}
