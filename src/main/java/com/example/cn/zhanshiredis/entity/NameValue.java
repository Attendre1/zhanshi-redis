package com.example.cn.zhanshiredis.entity;


/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */
public class NameValue {
    private String product_name;
    private int counts;

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }

    @Override
    public String toString() {
        return "NameValue{" +
                "product_name ='" + product_name + '\'' +
                ", counts=" + counts +
                '}';
    }
}
