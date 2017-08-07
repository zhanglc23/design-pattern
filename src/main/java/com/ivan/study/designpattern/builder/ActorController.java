package com.ivan.study.designpattern.builder;

/**
 * Description:
 * author zhanglc
 * Created on 2017/8/7.
 */

public class ActorController {

    //逐步构建复杂产品对象
    public Actor construct(ActorBuilder ab) {
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        ab.buildHairstyle();
        actor = ab.createActor();
        return actor;
    }
}
