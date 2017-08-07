package com.ivan.study.designpattern.singleton;

/**
 * Description:
 * author zhanglc
 * Created on 2017/8/7.
 */

public class DoubleCheckLockSingleton {

    private volatile static DoubleCheckLockSingleton instance = null;

    private DoubleCheckLockSingleton() {
    }

    public static DoubleCheckLockSingleton getInstance() {
        //第一重判断
        if (instance == null) {
            //锁定代码块
            synchronized (LazySingleton.class) {
                //第二重判断
                if (instance == null) {
                    instance = new DoubleCheckLockSingleton(); //创建单例实例
                }
            }
        }
        return instance;
    }
}
