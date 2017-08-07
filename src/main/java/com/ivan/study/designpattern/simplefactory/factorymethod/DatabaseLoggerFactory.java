package com.ivan.study.designpattern.simplefactory.factorymethod;

/**
 * Description:
 * author zhanglc
 * Created on 2017/8/7.
 */

public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
