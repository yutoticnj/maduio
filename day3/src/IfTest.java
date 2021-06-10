/*
分支结构中的if-else

三种结构
1、
if(){
}
2、
if(){
}else{
}
3、if(){
}else if{
}else{
}
 */

public class IfTest {
    public static void main(String[] args) {
    //举例一
        int heartBeats = 78;
        if(heartBeats < 60 || heartBeats >100){
            System.out.println("需要做进一步检查");
        }
        System.out.println("检查结束");

    //举例二
        int age = 22;
        if(age < 18){
            System.out.println("你还小");
        }
        System.out.println("你成人了");

    //举例三
        if(age < 0){
            System.out.println("您输入的数据错误");
        }else if (age < 18){
            System.out.println("少年时期");
        }else if (age < 35){
            System.out.println("青年时期");
        }else if (age < 60){
            System.out.println("中年时期");
        }else{
            System.out.println("老年时期");
        }
    }
}
