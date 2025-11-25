package Loop;
//循环嵌套联练习：99乘法表
public class LoopDemo3 {
    public static void main(String[] args) {
        // 外层循环控制行数 (a 从 1 开始，因为内层循环 b < a，如果 a=0 则内层循环不执行)
        for (int a = 1; a < 10; a++) {
            // 内层循环控制列数 (b 从 1 开始，b <= a)
            for (int b = 1; b <= a; b++) {
                int product = a * b;
                System.out.print(b + "*" + a + "=" + product + "\t");
            }
            System.out.println();
        }
    }
}