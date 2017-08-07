package com.ivan.study.designpattern.simplefactory.factorymethod;

/**
 * Description:
 * author zhanglc
 * Created on 2017/8/7.
 */

public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录。");
    }
}
