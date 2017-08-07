package com.ivan.study.designpattern.simplefactory;

/**
 * Description:
 * author zhanglc
 * Created on 2017/8/7.
 */

public class ChartFactory {

    public static Chart getChart(String chart) {
        Chart c = null ;
        if("histogram".equalsIgnoreCase(chart)) {
            c = new HistogramChart();
        }else if ("pie".equalsIgnoreCase(chart)) {
            c = new PieChart();
        }else if("line".equalsIgnoreCase(chart)) {
            c = new LineChart();
        }
        return c ;
    }
}
