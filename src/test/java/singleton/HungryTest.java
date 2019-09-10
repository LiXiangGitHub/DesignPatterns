package singleton;

import com.lixiang.pattern.singleton.hungry.Hungry;

public class HungryTest {

    public static void main(String[] args) {
            if(Hungry.getInstance()==Hungry.getInstance()){
                System.out.printf( "-----------------------对象是单例-----------------------");
            }else{
                System.out.printf( "-----------------------对象不是单例-----------------------");
            }
    }
}
