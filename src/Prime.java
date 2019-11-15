import java.util.Scanner;

/**
 * 求小于N的所有素数
 */
public class Prime {
    public static void main(String args[]) {
        /**
         * Scanner控制台输入一个整数
         */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 2; i < num; ++i) {
            if (isPrime1(i)) {
                System.out.println(i);
            }
        }
    }

    /**
     * 算法一
     * 只能被1或本身整除的整数
     * @param num
     * @return
     */
    public static boolean isPrime1(int num) {
        for (int i = 2; i < num; ++i) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 算法二
     * 12能被2整除，也能被6整除
     * 所以循环变成：Math.sqrt(num)
     * @param num
     * @return
     */
    public static boolean isPrime2(int num) {
        for (int i = 2; i < Math.sqrt(num); ++i) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
