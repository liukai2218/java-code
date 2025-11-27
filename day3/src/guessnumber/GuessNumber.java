package guessnumber;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        //从键盘输入一个数字（1-100）
        Scanner sc = new Scanner(System.in);
        int number = (int)(Math.random() * 100) + 1;
        System.out.println("猜数字游戏开始！请输入一个1到100之间的数字：");
        while (true) {
            int guess = sc.nextInt();
            if (guess < 1 || guess > 100) {
                System.out.println("请输入一个有效的数字（1-100）：");
                continue;
            }
            if (guess < number) {
                System.out.println("太小了！请再试一次：");
            } else if (guess > number) {
                System.out.println("太大了！请再试一次：");
            } else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }

    }
}
