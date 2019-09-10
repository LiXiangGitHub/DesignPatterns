package com.lixiang.pattern.prototype.deep;

import com.lixiang.pattern.prototype.simple.Body;

import java.io.*;

//浅克隆实现原型模式
public class DeepPrototype implements Cloneable,Serializable{
    //名字
    private String name;
    //年龄
    private int age;
    //身体
    private Body body;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    //重写clone方法
    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }
    //自定义深度clone方法
    //通过序列化后反序列化创建新对象
    public Object deepClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
            return "深度clone异常！";
        }
    }
    //手动创建对象形式,实现对象全clone
    public DeepPrototype copy(DeepPrototype sources){
        DeepPrototype deepPrototype = new DeepPrototype();
        Body body = new Body();
        body.setHead(sources.getBody().getHead());
        body.setHand(sources.getBody().getHand());
        body.setFoot(sources.getBody().getFoot());
        deepPrototype.setAge(sources.getAge());
        deepPrototype.setName(sources.getName());
        deepPrototype.setBody(body);
        return deepPrototype;
    }
}
