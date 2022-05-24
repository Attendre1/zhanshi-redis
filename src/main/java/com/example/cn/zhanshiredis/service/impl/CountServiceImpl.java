package com.example.cn.zhanshiredis.service.impl;


import com.example.cn.zhanshiredis.dao.CountDao;
import com.example.cn.zhanshiredis.dao.SumDao;
import com.example.cn.zhanshiredis.entity.CountValueName;
import com.example.cn.zhanshiredis.entity.ValueName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */
@Service
public class CountServiceImpl implements com.example.cn.zhanshiredis.service.CountService{
    @Autowired
    CountDao countDao;

    @Override
    public List<CountValueName> findAllCount() {return countDao.findAllCount(); }
}
