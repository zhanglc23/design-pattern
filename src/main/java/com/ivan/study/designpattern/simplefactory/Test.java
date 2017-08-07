package com.ivan.study.designpattern.simplefactory;

/**
 * Description:
 * author zhanglc
 * Created on 2017/8/7.
 */

public class Test {

    public static void main(String[] args) {
        Chart chart;
        chart = ChartFactory.getChart("histogram"); //通过静态工厂方法创建产品
        chart.display();
    }
}
