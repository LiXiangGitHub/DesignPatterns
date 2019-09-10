package com.lixiang.pattern.factory.func;

import com.lixiang.pattern.factory.Adidas;
import com.lixiang.pattern.factory.Clothes;

public class AdidasFactory implements Factory {
   @Override
    public Clothes getClothes(){
        return new Adidas();
    };
}
