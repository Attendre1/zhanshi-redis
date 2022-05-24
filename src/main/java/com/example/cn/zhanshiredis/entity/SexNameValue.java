package com.example.cn.zhanshiredis.entity;


/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */
public class SexNameValue {
    private String product_category;
    private int counts;

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }
    @Override
    public String toString() {
        return "SexNameValue{" +
                "product_category='" + product_category + '\'' +
                ", counts=" + counts +
                '}';
    }
}
