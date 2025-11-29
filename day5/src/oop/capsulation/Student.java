package oop.capsulation;

public class Student {
    String name;
    private int age;
    private double MathScore;
    private int ChineseScore;
    // 计算总分
    public void sumScore() {
        System.out.println(this.name + "的总分是：" + (this.ChineseScore + this.MathScore));
    }
    // 计算平均分
    public double average() {
        double avg = (this.ChineseScore + this.MathScore) / 2.0;
        System.out.println(this.name + "的平均分是：" + avg);
        return avg;
    }
    public void setAge(int age){
        if (age < 18) {
            this.age=age;
            System.out.println("年龄设置成功");
        }else
        {
            System.out.println("年龄设置有误");
        }
    }
    public int getAge(){
        return this.age;
    }
}
