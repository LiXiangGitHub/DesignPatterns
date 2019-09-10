package prototype;

import com.lixiang.pattern.prototype.deep.DeepPrototype;
import com.lixiang.pattern.prototype.simple.Body;
//clone方法 基本类型会完全赋值成功,对象类型只赋值引用
public class DeepPrototypeTest {

    public static void main(String[] args) {
        //创建一个Prototype对象
        DeepPrototype prototype = new DeepPrototype();
        Body body = new Body();
        body.setHead("张三的头");
        prototype.setName("张三");
        prototype.setBody(body);
        try {
//            DeepPrototype clonePrototype = (DeepPrototype)prototype.clone();
            DeepPrototype clonePrototype = (DeepPrototype)prototype.copy(prototype);
          //基本类型会被完全复制,原对象与clone对象互不干扰
            System.out.println("源对象name修改前："+prototype.getName());
            System.out.println("clone对象name修改前："+clonePrototype.getName());
            prototype.setName("李四");
            System.out.println("源对象name修改后："+prototype.getName());
            System.out.println("clone对象name修改后："+clonePrototype.getName());
            if(!prototype.getName().equals(clonePrototype.getName())){
                System.out.println("结论：基本类型会被完全复制,原对象与clone对象互不干扰!");
            }
            //对象类型只复制了引用,公用同一个对象,操作原对象会干扰
            if(clonePrototype.getBody() == prototype.getBody()){
                System.out.println("源对象Body修改前："+prototype.getBody().getHead());
                System.out.println("clone对象Body修改前："+clonePrototype.getBody().getHead());
                prototype.getBody().setHead("李四的头");
                System.out.println("源对象Body修改后："+prototype.getBody().getHead());
                System.out.println("clone对象Body修改后："+clonePrototype.getBody().getHead());
                System.out.println("结论：对象类型只复制了引用,公用同一个对象,操作源对象会干扰,发生浅拷贝!");
            }else{
                System.out.println("源对象Body修改前："+prototype.getBody().getHead());
                System.out.println("clone对象Body修改前："+clonePrototype.getBody().getHead());
                prototype.getBody().setHead("李四的头");
                System.out.println("源对象Body修改后："+prototype.getBody().getHead());
                System.out.println("clone对象Body修改后："+clonePrototype.getBody().getHead());
                System.out.println("结论：对象类型完全复制,对象不同,操作源对象互不干扰,深拷贝成功!");
            }
        }catch (Exception e){
            System.out.println("clone异常！");
        }
    }
}
