package singleton;

import com.lixiang.pattern.singleton.enumType.Color;

public class ColorTest {
    public static void main(String[] args) {
        int count = 3;
        for (int i=0;i<count;i++){
            System.out.printf(Color.getName(i+1)+"\n");
        }
    }
}
