package com.lixiang.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//注册式单例    spring中Beanfactory则使用这种方式实现
public class RegisterMap {
    private RegisterMap(){}
    //ConcurrentHashMap线程安全
    private static Map<String,Object> register = new ConcurrentHashMap<String, Object>();

    public  static RegisterMap getInstance(String name){
        //若未给名称，默认一个名称
        if(null == name){
            name = RegisterMap.class.getName();
        }
        //若未进行注册,则进行注册
        if(!register.containsKey(name)){
            register.put(name,new RegisterMap());
        }
        return (RegisterMap)register.get(name);
    }
}
