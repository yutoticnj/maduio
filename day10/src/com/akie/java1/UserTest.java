package com.akie.java1;

/*
* 总结属性复制的先后顺序
*
* 1、默认初始化
* 2、显式初始化
* 3、构造器初始化
* 4、通过“对象.方法”或“对象.属性”赋值
*
* 以上造作的先后顺序
* 1 —— 2 —— 3 —— 4
*
* */
public class UserTest {
    public static void main(String[] args) {
        User u = new User(2);

        u.setAge(18);
    }
}

class User{
    String name;
    int age = 1;

    public User(){}

    public User(int a){
        age = a;
    }

    public void setAge(int a){
        age = a;
    }

    public int getAge(){
        return age;
    }
}



