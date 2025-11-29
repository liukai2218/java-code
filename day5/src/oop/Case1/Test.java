package oop.Case1;

public class Test {
    public static void main(String[] args) {
        Star s1 = new Star();
        s1.name="赵丽颖";
        s1.age=30;
        s1.height=172;
        s1.weight=50;
        s1.gender="女";
        System.out.println("姓名："+s1.name);
        System.out.println("年龄："+s1.age);
        System.out.println("身高："+s1.height);
        System.out.println("体重："+s1.weight);
        System.out.println("性别："+s1.gender);
        Star s2 = new Star();
        s2.name="杨洋";
        s2.age=29;
        s2.height=183;
        s2.weight=70;
        s2.gender="男";
        System.out.println("姓名："+s2.name);
        System.out.println("年龄："+s2.age);
        System.out.println("身高："+s2.height);
        System.out.println("体重："+s2.weight);
        System.out.println("性别："+s2.gender);
        Student stu1 = new Student();
        stu1.name="林青霞";
        stu1.age=28;
        stu1.height=168;
        stu1.weight=48;
        stu1.gender="女";
        Student stu2 = new Student();
        stu2.name="张曼玉";
        stu2.age=29;
        stu2.height=165;
        stu2.weight=45;
        stu2.gender="女";
        System.out.println("姓名："+stu1.name);
        System.out.println("年龄："+stu1.age);
        System.out.println("身高："+stu1.height);
        System.out.println("体重："+stu1.weight);
        System.out.println("性别："+stu2.gender);
        System.out.println("姓名："+stu2.name);
        System.out.println("年龄："+stu2.age);
        System.out.println("身高："+stu2.height);
        System.out.println("体重："+stu2.weight);
        System.out.println("性别："+stu2.gender);
    }
}
