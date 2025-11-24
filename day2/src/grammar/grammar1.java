package grammar;

public class grammar1 {
    public static void main(String[] args) {
    //学习自动类型转换
    int  a=10;
    double b=a; //自动类型转换
    System.out.println("b="+b);
//强制类型转换
    double c=9.8;
    int d=(int)c; //强制类型转换
    System.out.println("d="+d);
    //数据溢出
    int e=130;
    byte f=(byte)e; //强制类型转换
    System.out.println("f="+f);//-126
    }

}
