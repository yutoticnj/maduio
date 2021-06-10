package com.akie.java;

/*类中属性的使用

属性（成员变量）  VS   局部变量

1、相同点
    1,1 定义变量的格式：  数据类型  变量名  = 变量值
    1,2 先声明，后使用
    1,3 变量都有其对应的作用域
2、不同点
    2,1在类中的声明的位置不同
    属性：直接定义在类的一对{}内
    局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量

    2,2关于权限修饰符的不同
    属性：可以再声明属性的时候，指明其权限，使用权限修饰符
        常用的权限修饰符：private public 缺省 protected
    局部变量：不可以使用权限修饰符

* */
public class UserTest {
}

class User {
    //属性（成员变量）
    String name;
    int age;
    boolean isMale;

    public void talk(String language) {//language 就是形参
        System.out.println("使用的语言是：" + language);
    }

    public void eat() {
        String food = "烙饼"; // 局部变量
        System.out.println("北方人喜欢吃：" + food);
    }
}
