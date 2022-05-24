package com.example.cn.zhanshiredis.entity;


/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */
public class ChargeNameValue {
    private String product_name;

    public String getClick_time() {
        return click_time;
    }

    public void setClick_time(String click_time) {
        this.click_time = click_time;
    }

    private String click_time;
    private int product_sale_price;


    public int getProduct_sale_price() {
        return product_sale_price;
    }

    public void setProduct_sale_price(int product_sale_price) {
        this.product_sale_price = product_sale_price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    @Override
    public String toString() {
        return "ChargeNameValue{" +
                "product_name='" + product_name + '\'' +
                ", click_time='" + click_time + '\'' +
                ", product_sale_price=" + product_sale_price +
                '}';
    }
}
