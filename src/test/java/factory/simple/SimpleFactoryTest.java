package factory.simple;

import com.lixiang.pattern.factory.simple.SimpleFactory;

public class SimpleFactoryTest {

    public static void main(String[] args){
        //需求者不知道生产过程,需求者需要向工厂提出需求。
        SimpleFactory factory = new SimpleFactory();
            System.out.println(factory.getClothes("阿迪达斯"));
            System.out.println(factory.getClothes("阿尼玛"));
            System.out.println(factory.getClothes("特步"));
    }

}
