package grammar;

public class grammer2 {
    public static void main(String[] args){
        //学习方法参数的自动类型提升
        int a=10;
        double b=9.8;
        methodA(a,b);//int->double

    }
    //定义方法表达式的自动类型提升
    public static void methodA(int a,double b){
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
}
