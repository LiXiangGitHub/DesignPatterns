package com.lixiang.pattern.factory.func;

import com.lixiang.pattern.factory.Clothes;

/**
 * 工厂模型
 * Created by Tom on 2018/3/4.
 */
public interface Factory {

    //工厂的共有生产技能
    public Clothes getClothes();
}
