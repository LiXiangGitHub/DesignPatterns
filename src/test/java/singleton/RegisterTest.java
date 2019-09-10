package singleton;

import com.lixiang.pattern.singleton.lazy.LazyTwo;
import com.lixiang.pattern.singleton.register.RegisterMap;

import java.util.concurrent.CountDownLatch;

public class RegisterTest {
    // RegisterMap线程安全问题测试
    public static void main(String[] args) {
        int count =20000;
        final CountDownLatch latch = new CountDownLatch(count);
        long start = System.currentTimeMillis();
        for(int i=0;i<count;i++){
            new Thread(){
                @Override
                public void  run(){
                    try {
                        //线程等待
                        latch.await();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    RegisterMap registerMap = RegisterMap.getInstance("lixiang");
                    System.out.printf(registerMap.toString()+"\n");
                }
            }.start();
            //指定数减一
            latch.countDown();
        }
        long end = System.currentTimeMillis();
        System.out.printf("总耗时：" +(end-start)+"\n");
    }
}
