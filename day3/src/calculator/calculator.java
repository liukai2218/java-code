package calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- 简单计算器 ---");

        while (true) {
            Double num1 = readDoubleOrExit(sc, "请输入第一个数字 (输入 exit 退出): ");
            if (num1 == null) break;

            System.out.print("请输入运算符 (+, -, *, /) 或输入 exit 退出: ");
            String opToken = sc.next();
            if (opToken.equalsIgnoreCase("exit")) break;
            char operator = opToken.charAt(0);

            Double num2 = readDoubleOrExit(sc, "请输入第二个数字 (输入 exit 退出): ");
            if (num2 == null) break;

            double result = 0;
            boolean isValid = true;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("错误：除数不能为 0！");
                        isValid = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("错误：无效的运算符！");
                    isValid = false;
            }

            if (isValid) {
                System.out.println("-----------------");
                System.out.printf("计算结果: %.2f %c %.2f = %.2f%n", num1, operator, num2, result);
            }

            System.out.println();
        }

        sc.close();
        System.out.println("程序结束。");
    }

    // 从 Scanner 读取 token，支持输入 "exit" 退出，返回 null 表示用户选择退出
    private static Double readDoubleOrExit(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (!sc.hasNext()) return null; // 流结束
            String token = sc.next();
            if (token.equalsIgnoreCase("exit")) return null;
            try {
                return Double.parseDouble(token);
            } catch (NumberFormatException e) {
                System.out.println("输入不是有效数字，请重试或输入 exit 退出。");
            }
        }
    }
}