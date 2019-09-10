package com.lixiang.pattern.factory.func;

import com.lixiang.pattern.factory.Anima;
import com.lixiang.pattern.factory.Clothes;

public class AnimaFactory implements Factory {
   @Override
    public Clothes getClothes() {
        return new Anima();
    }
}
