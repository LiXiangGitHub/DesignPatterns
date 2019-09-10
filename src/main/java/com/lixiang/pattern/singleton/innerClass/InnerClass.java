package com.lixiang.pattern.singleton.innerClass;
//静态内部内 既能保证线程安全，也能延迟加载避免内消耗并且也兼顾synchronized性能问题。推荐使用此方法实现单例模式
public class InnerClass {
    private InnerClass(){}

    //内部内未被使用的时候,是不会被加载的
    //调用InnerClassHolder时,会先初始化
    //final 关键字是为了避免getInstance方法被重新和重载
    public static final InnerClass getInstance(){
        return InnerClassHolder.innerClass;
    }

    /**
     * 静态内部内 第一次调用内部内的时候才会加载内部内 ，才会初始化实例对象
     */
    private static class InnerClassHolder{
        //static 关键字是为了共享单例
        private static InnerClass innerClass = new InnerClass();

    }
}
