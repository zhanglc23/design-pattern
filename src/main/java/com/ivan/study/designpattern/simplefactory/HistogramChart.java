package com.ivan.study.designpattern.simplefactory;

/**
 * Description: 柱状图类：具体产品类
 * author zhanglc
 * Created on 2017/8/7.
 */

public class HistogramChart implements Chart {

    public HistogramChart() {
        System.out.println("柱状图创建");
    }

    @Override
    public void display() {
        System.out.println("柱状图");
    }
}
