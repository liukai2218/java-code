package bmiTest;
import java.util.Scanner;

public class bimTest {
    public static void main(String[] args) {
        double weight ,height, bmi;
        int age;
        //从键盘输入体重，身高，年龄
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("请输入体重(kg): ");
        weight = scanner.nextDouble();
        System.out.print("请输入身高(m): ");
        height = scanner.nextDouble();
        System.out.print("请输入年龄: ");
        age = scanner.nextInt();
        bmi = calculateBMI(weight, height);
        System.out.printf("您的BMI值为: %.2f\n", bmi);
        double bmr = calculateBMR(weight, height, age);
        System.out.printf("您的BMR值为: %.2f\n", bmr);
        scanner.close();
        judjeHealth(bmi);
    }
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    public  static double calculateBMR(double weight, double height, int age) {
        return 88.362 + (13.397 * weight) + (4.799 * height * 100) - (5.677 * age);
    }
    //根据计算数据判断是否健康
    public static  void judjeHealth(double bmi) {
        if (bmi < 18.5) {
            System.out.println("体重过轻");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("体重正常");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("体重过重");
        } else {
            System.out.println("肥胖");
        }
    }
}
