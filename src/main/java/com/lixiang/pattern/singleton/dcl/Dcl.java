package com.lixiang.pattern.singleton.dcl;
//双检验锁实现单例 double check lock
//优点：资源利用率高，及能在使用的时候才初始化实例，又能保证线程安全。
//缺点：第一次加载稍慢，由于java内存模型的原因偶尔会失败,在高并发下也有缺陷，但发生概率小
public class Dcl {
    private static Dcl dcl = null;

    private Dcl(){}
    //两次空判断
    public static Dcl getInstance(){
        //第一次为了避免不必要的同步
        if(null ==dcl){
            synchronized (Dcl.class){
                //第二次为了确保在null 的情况想创建实例
                if(null ==dcl){
                    dcl = new Dcl();
                }
            }
        }
        return dcl;
    }
}
