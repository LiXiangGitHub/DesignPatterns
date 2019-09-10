package com.lixiang.pattern.singleton.hungry;
//饿汉式单例  类加载时立马初始化,并创建单例对象。
//优点：①没有锁机制,执行效率高,用户体验比懒汉式好 ②线程安全,在线程还未出现前就已经实例化，不存在线程访问安全问题
//缺点：①占用内存 类加载时立马初始化,并创建单例对象 不管使用或不使用 ,内存都被占用 ,可能站着茅坑不拉屎。
public class Hungry {

    private Hungry(){};

    //先静态，后动态
    //先成员，后方法
    //先上，后下
    private static final Hungry hungty = new Hungry();

    public static Hungry getInstance(){
        return hungty;
    }
}
