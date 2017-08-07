package com.ivan.study.designpattern.singleton;

/**
 * Description:
 * author zhanglc
 * Created on 2017/8/7.
 */

public class InnerSingleton {

    private InnerSingleton() {
    }

    private static class HolderClass {
        private final static InnerSingleton instance = new InnerSingleton();
    }

    public static InnerSingleton getInstance() {
        return HolderClass.instance;
    }

    public static void main(String args[]) {
        InnerSingleton s1, s2;
        s1 = InnerSingleton.getInstance();
        s2 = InnerSingleton.getInstance();
        System.out.println(s1 == s2);
    }
}
