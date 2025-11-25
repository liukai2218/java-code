package Loop;

import java.util.Scanner;

public class LoopDemo1
{
    public static void main(String[] args) {
        //循环的几种方式
        Scanner sc = new Scanner(System.in);
        //1. for循环
        for (int i = 1; i <= 5; i++) {
            System.out.println("for循环第 " + i + " 次");
        }
        //2. while循环
    //使用键盘输入控制while循环的次数
        System.out.println("请输入一个整数(1-5): ");
        int j = sc.nextInt();
        while (j <= 5) {
            System.out.println("while循环第 " + j + " 次");
            j++;
        }
        //3. do-while循环
        System.out.println("请输入一个整数(1-5): ");
        int k = sc.nextInt();
        do {
            System.out.println("do-while循环第 " + k + " 次");
            k++;
        } while (k <= 5);
        }
    }

