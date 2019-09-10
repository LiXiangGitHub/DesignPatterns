package singleton;

import com.lixiang.pattern.singleton.seriable.Seriable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriableTest {

    public static void main(String[] args) {
        Seriable seriable_one = null;
        Seriable seriable_two = Seriable.getInstance();
        try {
            //将对象所有信息(包含状态)写入文件
            FileOutputStream fos = new FileOutputStream("Seriable.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(seriable_two);
            oos.flush();
            oos.close();
            //读取文件中对象
            FileInputStream fis = new FileInputStream("Seriable.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            seriable_one = (Seriable)ois.readObject();

            System.out.printf(String.valueOf(seriable_one==seriable_two)+"\n");
        }catch (Exception e){

        }

    }
}
