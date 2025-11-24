package Basic;

import java.util.Scanner;

public class counts {
    // static {
    // Scanner scanner = new Scanner(System.in);

    // }

    static void counts(int n) {
        if (n == 0)
            return;
        else {
            System.out.println(n);
            counts(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("enter n ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        counts(n);

    }

}
