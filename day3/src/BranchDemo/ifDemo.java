package BranchDemo;

import java.util.Scanner;

public class ifDemo
{
    public static void main(String[] args) {

        ifDemo1();
    }
    public static  void ifDemo1() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请输入年级数 (1-4)，输入0或exit退出: ");
            if (sc.hasNextInt()) {
                int grade = sc.nextInt();
                if (grade == 0) {
                    System.out.println("退出程序。");
                    break;
                }
                if (grade == 4) {
                    System.out.println("大四");
                } else if (grade == 3) {
                    System.out.println("大三");
                } else if (grade == 2) {
                    System.out.println("大二");
                } else if (grade == 1) {
                    System.out.println("大一");
                }
            }
        }
    }
}