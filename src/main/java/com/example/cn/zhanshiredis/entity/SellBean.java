package com.example.cn.zhanshiredis.entity;


import java.util.List;

/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */
public class SellBean {
    //
    private List<String> names;
    private List<Integer> values;


    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public List<Integer> getValues() {
        return values;
    }

    public void setValues(List<Integer> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "SellBean{" +
                "names=" + names +
                ", values=" + values +
                '}';
    }
}
