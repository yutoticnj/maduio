package com.akie.java2;

import com.akie.accountcustomerbank.Account;
import com.akie.accountcustomerbank.Bank;

import java.util.*;

/*
* 一、package关键字的使用
* 1、为了实现更好 地实现项目中类的管理，提供包的概念
* 2、使用package声明类或接口所述的包，声明在源文件的首行
* 3、包，属于标识符，遵循标识符的命名规则和规范“见明知意”
* 4、每点一次就代表一层文件目录
*
* 补充：同一个包下，不能命名同名的接口、类
*
* 二、import关键字的使用
* import：导入
* 1、在原文件中显式的使用import导入指定包下的类、接口
* 2、声明在包和声明和类的生声明之间
* 3、如果需要导入多个结构，则并列写出即可
* 4、可以使用xxx.*的方式表示可以导入xxx包下的所有结构
* 5、如果使用的类或者结构在java.lang下可以省略
* 6、如果使用的类或接口在本包下定义的可以省略
* 7、如果在原文件中使用了不同包下的同名的类则必须有一个类需要以全类名的方式表示
* 8、使用“xxx.*”的方式表明可以调用xxx包下的所有结构，但是如果使用的是xxx包下子包的结构，则仍需要导入
* 9、import static：导入指定类或接口中的静态结构：属性或者方法
*
* */
public class PackageImportTest {
    public static void main(String[] args) {
        String info = Arrays.toString(new int[]{1,2,3});

        Bank bank = new Bank();

        ArrayList list = new ArrayList();
        HashMap map = new HashMap();

        Account acct = new Account(2000);

        //全类名的方式
        com.akie.accountcustomer.Account acct1 = new com.akie.accountcustomer.Account(200,2000,1);
    }
}
