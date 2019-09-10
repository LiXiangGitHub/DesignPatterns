package com.lixiang.pattern.factory.abstr;

import com.lixiang.pattern.factory.Anima;
import com.lixiang.pattern.factory.Clothes;
import com.lixiang.pattern.factory.Xtep;

/**
 * Created by Weiai on 2018/3/4.
 */
public class ClothesFactory extends AbstractFactory {

    @Override
    public Clothes getAdidas() {
        return new Anima();
    }

    @Override
    public Clothes getAnima() {
        return new Anima();
    }

    @Override
    public Clothes getXtep() {
        return new Xtep();
    }
}
