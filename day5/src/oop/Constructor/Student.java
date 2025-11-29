package oop.Constructor;

public class Student {
    String name ;
    int age;
    char gender;
    //无参数构造器：无返回值类型，方法名与类名相同
    public Student() {
        System.out.println("我是无参数构造器");
    }
    //有参数构造器
    public Student(String n,int a,char g) {
    System.out.println("我是有参数构造器");
    }
    }


