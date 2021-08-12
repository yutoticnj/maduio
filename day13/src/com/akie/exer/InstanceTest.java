package com.akie.exer;

public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();
        test.method(new Student());
    }

    public void method(Person e){
        System.out.println(e.getInfo());
        System.out.println();
        if (e instanceof Graduate) {
            System.out.println("A graduate student");
            System.out.println("A student");
            System.out.println("A person");
        } else if (e instanceof Student) {
            System.out.println("A student");
            System.out.println("A person");
        } else {
            System.out.println("A person");
        }
    }
}


class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo(){return "Name: " + name +"\n"+ "age: " + age;}
}

    class Student extends Person {
        protected String school = " pku";

        public String getInfo() {
            return "Name: " + name + " \nage: " + age + "\nschool:" + school;
        }

    }
    class Graduate extends Student {
            public String major = "IT";

            public String getInfo() {
                return "Name: " + name + " \nage: " + age + "\nschool: "
                        + school + "\nmajor :" + major;
            }
    }
