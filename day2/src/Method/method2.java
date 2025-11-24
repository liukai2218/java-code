package Method;

public class method2
{
    //方法重载
    public static void main(String[] args) {
        int sum=getMax(4,5);
        System.out.println("最大值是："+sum);
        double sum2=getMax(4.5,3.2);
        System.out.println("最大值是："+sum2);
        int sum3=getMax(10,7,15);
        System.out.println("最大值是："+sum3);
    }
    //定义一个方法求取两个整数最大值
    public static int getMax(int a, int b) {
        return a > b ? a : b;

    }
    //定义一个方法求取两个小数最大值
    public static double getMax(double a, double b) {
        return a > b ? a : b;
    }
    //定义一个方法求取三个整数最大值
    public static int getMax(int a, int b, int c) {
        int max=a>b?a:b;
        return max>c?max:c;}
}
