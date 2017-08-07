package com.ivan.study.designpattern.simplefactory;

/**
 * Description:
 * author zhanglc
 * Created on 2017/8/7.
 */

public class LineChart implements Chart {

    public LineChart() {
        System.out.println("折线图创建");
    }

    @Override
    public void display() {
        System.out.println("折线图");
    }
}
