package factory.abstr;

import com.lixiang.pattern.factory.abstr.ClothesFactory;

public class AbstractFactoryTest {
    
    public static void main(String[] args) {
        ClothesFactory clothesFactory = new ClothesFactory();


        //对于用户而言，更加简单了
        //用户只有选择的权利了，保证了程序的健壮性
        System.out.println("clothesFactory.getAdidas() = " + clothesFactory.getAdidas());
    }
    
}
