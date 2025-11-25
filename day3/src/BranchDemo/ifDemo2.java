package BranchDemo;

import java.util.Scanner;

public class ifDemo2
{
    public static void main(String[] args) {
        boolean isRedLight, isYellowLight, isGreenLight;
        Scanner sc = new Scanner(System.in);
        //请输入三种信号灯的状态
        System.out.print("请输入红灯状态(true/false): ");
        isRedLight = sc.nextBoolean();
        System.out.print("请输入黄灯状态(true/false): ");
        isYellowLight = sc.nextBoolean();
        System.out.print("请输入绿灯状态(true/false): ");
        isGreenLight = sc.nextBoolean();
        trafficLightDemo(isRedLight,isYellowLight ,isGreenLight);
    }

  //通过三种信号灯的状态判断自动汽车是否通过
    public static void trafficLightDemo(boolean isRedLight, boolean isYellowLight, boolean isGreenLight) {
        if (isRedLight) {
            System.out.println("红灯，停车等待");
        } else if (isYellowLight) {
            System.out.println("黄灯，减速慢行");
        } else if (isGreenLight) {
            System.out.println("绿灯，可以通行");
        } else {
            System.out.println("信号灯异常，请注意安全");
        }
    }
}
