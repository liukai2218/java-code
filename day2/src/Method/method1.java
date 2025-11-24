package Method;

public class method1 {
    public static void main(String[] args) {
    int sum=getMax(4,5);
    System.out.println("最大值是："+sum);
    int sum2=getMax(10,7);
    System.out.println("最大值是："+sum2);
    int sum3=getMax(10,7);
    System.out.println("最大值是："+sum3);
        printf();
        String getCode= getCode(6);
        System.out.println("验证码是："+getCode);
        System.out.println("验证码是："+getCode(10));
    }
    //定义一个方法求取两个整数最大值
    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }
    //定义方法打印三行hello
    public static void printf() {
    System.out.println("hello");
    System.out.println("hello");
    System.out.println("hello");}
//定义方法获取指定位数验证码返回
    public static String getCode(int n){
        String code="";
        for (int i = 0; i < n; i++) {
            int num=(int)(Math.random()*10);
            code+=num;
        }
        return code;
    }

}
