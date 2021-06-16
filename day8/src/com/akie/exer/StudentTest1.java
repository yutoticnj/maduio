package com.akie.exer;

/*
* 4.对象数组题目:
* 定义类Student，包含三个属性:学号number(int)，年级state(int)，成绩
* score(int)。创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
* 问题一:打印出3年级(state值为3）的学生信息。
* 问题二:使用冒泡排序按学生成绩排序，并遍历所有学生信息
* 提示:
* 1)生成随机数:Math.random()，返回值类型double;
 *2)四舍五入取整:Math.round(double d)，返回值类型long.
*/

//改进：   遍历   排序  封装至方法
public class StudentTest1 {
    public static void main(String[] args) {
        Student1[] stus = new Student1[20];
        for (int i = 0; i < stus.length; i++) {
            stus[i] = new Student1();
            stus[i].number = i + 1;
            stus[i].state = (int)(Math.random()*5 + 1);
            stus[i].score = (int)(Math.random() *101);
        }

        StudentTest1 test = new StudentTest1();
        test.print(stus);
        test.searchState(stus,3);
        test.sort(stus);
        test.print(stus);

    }

    //遍历Student1[]数组的操作
    public void print(Student1[] stus) {
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].info());
        }
    }

    //查找对应年级信息
    public void searchState(Student1[] stus,int state) {
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        for (int i = 0; i < stus.length; i++) {
            if (stus[i].state == 3) {
                System.out.println("该生的成绩为： " + stus[i].score);
            }
        }
    }
    //按照成绩从低到高排序
    public void sort(Student1[] stus) {
        for (int i = 0; i < stus.length - 1; i++) {
            for (int j = 0; j < stus.length - 1 - i; j++) {
                if (stus[j].score > stus[j + 1].score) {
                    //输入需要交换，是交换的数组的元素，而不是成绩
                    Student1 temp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = temp;
                }
            }
        }
    }
}

class Student1 {
    int number;//学号
    int state;//年级
    int score;//成绩

    public String info(){
        return "学号：" + number + " ，年级：" + state +  " ,成绩："+ score;
    }
}