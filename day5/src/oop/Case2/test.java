package oop.Case2;

public class test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name="波妞";
        stu1.ChineseScore=98.5;
        stu1.MathScore=95.0;
        Student stu2 = new Student();
        stu2.name = "波仔";
        stu2.ChineseScore=88.5;
        stu2.MathScore=85.0;
        stu2.sumScore();
        stu1.sumScore();
        stu1.average();
        stu2.average();
    }

}
