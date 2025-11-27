package PrimeCounter;

public class PrimeCounter {
    public static void main(String[] args) {
        int count = 0;
        System.out.print("1到100之间的素数为：");
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("1到100之间的素数个数为：" + count);
    }

    //定义一个方法用于判断一个数是否为素数
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
