package com.example.cn.zhanshiredis.controller;
import com.example.cn.zhanshiredis.entity.*;
import com.example.cn.zhanshiredis.service.SumService;
import org.apache.hadoop.fs.shell.Count;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 张鹏飞
 * @company： 软通动力信息技术股份有限公司
 * @Official： www.isoftstone.com
 */
@Controller
public class EchartsController {

    @Autowired
    com.example.cn.zhanshiredis.service.MarketService marketService;
    @Autowired
    com.example.cn.zhanshiredis.service.ChargeService chargeService;
    @Autowired
    com.example.cn.zhanshiredis.service.SexService sexService;
    @Autowired
    com.example.cn.zhanshiredis.service.SellService sellService;


    @Autowired
    com.example.cn.zhanshiredis.service.SumService sumService;
    @Autowired
    com.example.cn.zhanshiredis.service.CountService countService;

//    @Autowired
//    StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/charts/charge")
    public String getCharge(){
       return "charts/7";
    }


    @RequestMapping("/charts/market")
    public String getmarket(){
        return "charts/lineAndBar";
    }

    @RequestMapping("/charts/posi")
    public String getPosi(){
        return "charts/pie";
    }

    @RequestMapping("/charts/aaa")
    public String getAaa(){
        return "charts/0";
    }
    @RequestMapping("/charts/sex")
    public String getSex(){
        return "charts/2";
    }
    @RequestMapping("/charts/sell")
    public String getSell(){
        return "charts/3";
    }
    @RequestMapping("/charts/count")
    public String getCount(){
        return "charts/4";
    }
    @RequestMapping("/charts/sum")
    public String getSum(){
        return "charts/1";
    }



    @RequestMapping("/charts/getMarketData")
    @ResponseBody
    public MarketBean getMarketData(){
        MarketBean marketBean = new MarketBean();
        //
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();
        //从数据库中获取数据
        List<NameValue> allMarket = marketService.findAllMarket();
        //循环遍历
        for (NameValue nameValue : allMarket) {
            names.add(nameValue.getProduct_name());
            values.add(nameValue.getCounts());
        }
        //赋值
        marketBean.setNames(names);
        marketBean.setValues(values);
        //把数据以数组的形式返回即可
        return marketBean;
    }
    @RequestMapping("/charts/getSumData")
    @ResponseBody
    public List<ValueName> getSumData(){
        List<ValueName> allSum =sumService.findAllSum();
        System.out.println(allSum);
        return allSum;
    }
    @RequestMapping("/charts/getCountData")
    @ResponseBody
    public List<CountValueName> getCountData(){
        List<CountValueName> allCount = countService.findAllCount();
        System.out.println(allCount);
        return allCount;
    }

    @RequestMapping("/charts/getChargeData")
    @ResponseBody
    public ChargeBean getChargeData(){
        ChargeBean  chargeBean = new ChargeBean();
        //
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();
        //从数据库中获取数据
        List<ChargeNameValue> allCharge = chargeService.findAllCharge();
        //循环遍历
        for (ChargeNameValue chargeNameValue : allCharge) {
            names.add("时间："+chargeNameValue.getClick_time()+"商品名称："+chargeNameValue.getProduct_name());
            values.add(chargeNameValue.getProduct_sale_price());
        }
        //赋值
        chargeBean.setNames(names);
        chargeBean.setValues(values);
        //把数据以数组的形式返回即可
        return chargeBean;
    }
    @RequestMapping("/charts/getSexData")
    @ResponseBody
    public SexBean getSexData(){
        SexBean  sexBean = new SexBean();
        //
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();
        //从数据库中获取数据
        List<SexNameValue> allSex = sexService.findAllSex();
        //循环遍历
        for (SexNameValue sexNameValue : allSex) {
            names.add(sexNameValue.getProduct_category());
            values.add(sexNameValue.getCounts());
        }
        //赋值
        sexBean.setNames(names);
        sexBean.setValues(values);
        //把数据以数组的形式返回即可
        return sexBean;
    }
    @RequestMapping("/charts/getSellData")
    @ResponseBody
    public SellBean getSellData(){
        SellBean  sellBean = new SellBean();
        //
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();
        //从数据库中获取数据
        List<SellNameValue> allSell = sellService.findAllSell();
        //循环遍历
        for (SellNameValue sellNameValue : allSell) {
            names.add(sellNameValue.getProduct_category());
            values.add(sellNameValue.getCounts());
        }
        //赋值
        sellBean.setNames(names);
        sellBean.setValues(values);
        //把数据以数组的形式返回即可
        return sellBean;
    }



}
