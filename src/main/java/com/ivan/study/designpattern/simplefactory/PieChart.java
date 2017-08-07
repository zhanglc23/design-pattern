package com.ivan.study.designpattern.simplefactory;

/**
 * Description:
 * author zhanglc
 * Created on 2017/8/7.
 */

public class PieChart implements Chart {
    public PieChart() {
        System.out.println("饼状图创建");
    }

    @Override
    public void display() {
        System.out.println("饼状图");
    }
}
