package BranchDemo;

import java.util.Scanner;

public class ifDemo3 {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入当前信号灯颜色（red/yellow/green）：");
            String lightColor = sc.nextLine();
            trafficLightDemo(lightColor);

        }
    }
    //建立一个方法，使用switch语句，判断一辆自动汽车是否可以通过路口
    public static void trafficLightDemo(String lightColor) {
            switch (lightColor.toLowerCase()) {//toLowerCase（）方法用来将字符串转换为小写字母
                case "red":
                    System.out.println("红灯，停车等待");
                    break;
                case "yellow":
                    System.out.println("黄灯，减速慢行");
                    break;
                case "green":
                    System.out.println("绿灯，可以通行");
                    break;
                default:
                    System.out.println("信号灯异常，请注意安全");
                    break;

        }

    }
}
