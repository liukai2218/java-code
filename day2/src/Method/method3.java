package Method;

public class method3
{
    public static void main(String[] args) {
        //掌握在无返回值的情况下单独使用return

        System.out.println("方法开始");
        test1();
        System.out.println("方法结束");

        double a=10.0;
        double b=0.0;
        div(10,2);
        div(10,0);
        System.out.println("结束");

    }
    public static void test1(){
        for (int i = 0; i < 10; i++) {
            if(i==5){
                System.out.println("遇到5，提前结束方法");
                return;//结束方法
            }
            System.out.println(i);
        }
        System.out.println("test1方法结束");
    }
    //设计一个除法功能
    public static void div(int a,int b){
        if(b==0){
            System.out.println("除数不能为0，结束方法");
            return;//结束方法
        }
        System.out.println("结果是："+(a/b));
    }
}
