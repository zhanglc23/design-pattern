package com.ivan.study.designpattern.simplefactory.factorymethod;

/**
 * Description:
 * author zhanglc
 * Created on 2017/8/7.
 */

public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录。");
    }
}
