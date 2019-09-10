package com.lixiang.pattern.singleton.enumType;

public enum Color {
    RED("红色",1),GREEN("绿色",2),BLANK("白色",3);

    private String name;
    private int code;

    private Color(String name,int code){
        this.name=name;
        this.code=code;
    }
    //获取名称
    public static String getName(int code){
        for (Color color:Color.values()){
            if( color.getCode()==code){
                return color.getName();
            }
        }
        return  null;
    }

    //get set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
