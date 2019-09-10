package com.lixiang.pattern.factory.func;

import com.lixiang.pattern.factory.Clothes;
import com.lixiang.pattern.factory.Xtep;

public class XtepFactory implements Factory{
    @Override
    public Clothes getClothes() {
        return new Xtep();
    }
}
