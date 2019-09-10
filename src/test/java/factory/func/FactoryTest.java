package factory.func;

import com.lixiang.pattern.factory.func.AdidasFactory;
import com.lixiang.pattern.factory.func.AnimaFactory;
import com.lixiang.pattern.factory.func.Factory;
import com.lixiang.pattern.factory.func.XtepFactory;

public class FactoryTest {
    public static void main(String[] args){
        //货比三家
        //不知道哪家好
        //配置可能会出错
//    Factory factory = new XtepFactory();
//    Factory factory = new AdidasFactory();
        Factory factory = new AdidasFactory();
        System.out.println(factory.getClothes());
        factory = new AnimaFactory();
        System.out.println(factory.getClothes());
        factory = new XtepFactory();
        System.out.println(factory.getClothes());
    }
}
