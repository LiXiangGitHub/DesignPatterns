package com.lixiang.pattern.factory.simple;

import com.lixiang.pattern.factory.Adidas;
import com.lixiang.pattern.factory.Anima;
import com.lixiang.pattern.factory.Clothes;
import com.lixiang.pattern.factory.Xtep;

/**
 * Created by weiai on 2018/3/28.
 */
public class SimpleFactory {
 public Clothes getClothes(String name){
     Clothes clothes = null;
     if("阿尼玛".equals(name)){
         clothes = new Anima();
         return clothes;
     }else if("特步".equals(name)){
         clothes = new Xtep();
         return clothes;
     }else if("阿迪达斯".equals(name)){
         clothes = new Adidas();
         return clothes;
     }else{
         System.out.println("无法生成你需要的衣服");
         return null;
     }
 }
}
