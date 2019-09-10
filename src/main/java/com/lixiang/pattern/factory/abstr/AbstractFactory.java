package com.lixiang.pattern.factory.abstr;

import com.lixiang.pattern.factory.Clothes;

/**
 *
 * 抽象工厂是用户的主入口
 * 在Spring中应用得最为广泛的一种设计模式
 * 易于扩展
 * Created by Weiai on 2018/3/4.
 */
public abstract class AbstractFactory {
    /**
     * 获得一个阿迪达斯品牌的衣服
     * @return
     */
    public abstract Clothes getAdidas();
    /**
     * 获得一个阿尼玛品牌的衣服
     * @return
     */
    public abstract Clothes getAnima();
    /**
     * 获得一个特步品牌的衣服
     * @return
     */
    public  abstract Clothes getXtep();
}
