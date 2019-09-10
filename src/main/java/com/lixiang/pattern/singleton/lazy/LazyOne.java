package com.lixiang.pattern.singleton.lazy;
//懒汉式 在外部使用时候，才进行实例化
public class LazyOne {
    private LazyOne(){}
    private static LazyOne lazyOne = null;
    //线程不安全
    public static LazyOne getInstance(){
        //调用之前先判断,若没有初始化则进行初始化，并进行赋值,并将值保存起来
        if(null==lazyOne){
            //线程不安全。多个线程可能同时进入if
            lazyOne = new LazyOne();
        }
        //若已经初始化，则直接返回对象
        return lazyOne;
    }
}
