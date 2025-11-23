package Basic;

import java.util.Scanner;

public class powerNM {
    public static int powerOfTwo(int n) {
        if (n == 0)
            return 1;
        else
            return 2 * powerOfTwo(n - 1);

    }

    // 2 ^4 = 2 * 2^3
    // 2^3 = 2 * 2^2
    // 2^2 = 2 * 2^1
    // 2^1 = 2 * 2^0
    // 2^0 = 1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = scanner.nextInt();
        System.out.println(powerNM.powerOfTwo(n));
    }

}
