package com.ivan.study.designpattern.singleton;

/**
 * Description:
 * author zhanglc
 * Created on 2017/8/7.
 */

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
