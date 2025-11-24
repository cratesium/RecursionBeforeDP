package Basic;

import java.util.Scanner;

public class headcountRecursionWithStaticBlock {

    static void counts(int n) {
        if (n == 0)
            return;
        else {
            counts(n - 1);
            System.out.println(n);
            // counts(n - 1);
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter n : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        counts(n);
    }

}
