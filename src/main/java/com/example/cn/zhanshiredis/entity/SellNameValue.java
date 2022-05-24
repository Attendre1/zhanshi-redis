package com.example.cn.zhanshiredis.entity;


/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */
public class SellNameValue {
    private String product_category;
    private int counts;

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }

    @Override
    public String toString() {
        return "SellNameValue{" +
                "product_category='" + product_category + '\'' +
                ", counts=" + counts +
                '}';
    }
}
