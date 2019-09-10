package singleton;

import com.lixiang.pattern.singleton.dcl.Dcl;
import com.lixiang.pattern.singleton.innerClass.InnerClass;

import java.util.concurrent.CountDownLatch;

public class InnerClassTest {
    //InnerClass线程安全问题测试
    public static void main(String[] args) {
        int count = 20000;
        //闭锁 等待指定数量的线程完成工作后执行(使用场景:并发测试、开始执行前等待n个线程完成各自任务、死锁检测)
        final CountDownLatch latch = new CountDownLatch(count);
        long start = System.currentTimeMillis();
        for (int i=0;i<count;i++){
            new Thread(){
                @Override
                public void run(){
                    try {
                        //线程等待
                        latch.await();
                    }catch (Exception e){

                    }
                    InnerClass innerClass = InnerClass.getInstance();
                    System.out.printf(innerClass.toString()+"\n");
                }
            }.start();
            //指定数量减一
            latch.countDown();
        }
        long end = System.currentTimeMillis();
        System.out.printf("总耗时：" +(end-start)+"\n");
    }
}
