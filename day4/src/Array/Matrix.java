package Array;

import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        int [][] matrix = start(3);
        printMatrix(matrix);
        shuffleMatrix(matrix);
        printMatrix(matrix);

    }

    public static int[][] start(int n) {
        int[][] arr = new int[n][n];
        //遍历二维数组，完成赋值
        int value = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = value++;
            }
        }return arr;
    }

    //设计一个方法打印输出二维数组
    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    //设计一个方法打乱二维数组元素
    public static void shuffleMatrix(int arr[][]) {
        Random rand = new Random();
        int n = arr.length;
        int size =n*n;
        //将二维数组的元素储存在一个一维数组中
        int[] flatArray = new int[size];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                flatArray[k++] = arr[i][j];
            }
        }
        // 对一维数组进行打乱。
        for (int i = size - 1; i > 0; i--) {
            // 随机选择一个索引 j，范围是 [0, i] (包括 i)
            int j = rand.nextInt(i + 1);
            int temp = flatArray[i];
            flatArray[i] = flatArray[j];
            flatArray[j] = temp;
        }
        //重构二维数组
        k=0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = flatArray[k++];
            }
        }

    }

}