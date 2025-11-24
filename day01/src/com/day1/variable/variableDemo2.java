package com.day1.variable;

public class variableDemo2 {
    public static void main(String[] args) {
    demo();
    }
    public static void demo(){
//表示8种基本数据类型的定义
        //整数类型
        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 100000000L;

        //浮点类型
        float f = 12.34f;
        double d = 56.78;

        //字符类型
        char c = 'A';

        //布尔类型
        boolean bool = true;
        //字符串类型
        String str = "Hello, World!";

        //打印变量的值
        System.out.println("byte类型变量b的值: " + b);
        System.out.println("short类型变量s的值: " + s);
        System.out.println("int类型变量i的值: " + i);
        System.out.println("long类型变量l的值: " + l);
        System.out.println("float类型变量f的值: " + f);
        System.out.println("double类型变量d的值: " + d);
        System.out.println("char类型变量c的值: " + c);
        System.out.println("boolean类型变量bool的值: " + bool);
        System.out.println("String类型变量str的值: " + str);
    }

}
