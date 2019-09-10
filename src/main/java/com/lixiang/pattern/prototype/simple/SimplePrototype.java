package com.lixiang.pattern.prototype.simple;

import java.io.Serializable;

//浅克隆实现原型模式
public class SimplePrototype implements Cloneable {
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
