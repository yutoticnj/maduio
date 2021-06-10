/*
标识符的应用
类名、变量名、包名等等
规则：
1、字母、0-9、$组成
2、数字不能开头
3、不能包括空格

名称规范
包名：多单词组成均小写   xxxxyyyyzzzz
类名、接口名：均首字母大写 XxxYyyZzz
变量名、方法名称：第一个单词首字母小写后续首字母大写  xxxYyyZzz
常量名称：均大写  XXXYYYZZZ

 */
public class Identifier {
    public static void main(String[] args){
        int myNumber = 1000;  //myNumber遵循规范
        System.out.println("标识符的应用");
        System.out.println(myNumber);
    }
}
