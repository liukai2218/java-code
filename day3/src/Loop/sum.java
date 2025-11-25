package Loop;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
    SumOfOddNumbers();
        }
public  static void SumOfOddNumbers(){
    Scanner sc = new Scanner(System.in);
    System .out.println("请输入奇数求和范围");
    int i=sc.nextInt();
    int j=0;
    for(int sum =0;sum<=i;sum++){
        if(sum%2!=0){
            j+=sum;
            }
        }
    System.out.println("1到"+i+"之间的奇数和为："+j);
}
}
