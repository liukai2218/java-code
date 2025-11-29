package oop.Case2;

public class Student {
    String name;
    double ChineseScore;
    double MathScore;
    // 计算总分
    public void sumScore() {
        System.out.println(this.name + "的总分是：" + (this.ChineseScore + this.MathScore));
    }
    // 计算平均分
    public double average() {
        double avg = (this.ChineseScore + this.MathScore) / 2.0;
        System.out.println(this.name + "的平均分是：" + avg);
        return avg; // 平
    }
}
