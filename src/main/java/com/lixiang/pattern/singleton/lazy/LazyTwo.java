package com.lixiang.pattern.singleton.lazy;
//懒汉式 在外部使用的时候，才进行实例化
public class LazyTwo {
    private LazyTwo() {}
    private static LazyTwo lazyTwo = null;
    //同步锁实现线程安全，但效率低
    public static synchronized LazyTwo getInstance(){
        if (null==lazyTwo){
            lazyTwo = new LazyTwo();
        }
        return lazyTwo;
    }
}
