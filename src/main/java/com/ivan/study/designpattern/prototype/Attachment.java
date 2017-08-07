package com.ivan.study.designpattern.prototype;

import java.io.Serializable;

/**
 * Description:
 * author zhanglc
 * Created on 2017/8/7.
 */

public class Attachment implements Serializable {

    //    private static final String seriSTRIN
    private String name; //附件名

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void download() {
        System.out.println("下载附件，文件名为" + name);
    }

}
