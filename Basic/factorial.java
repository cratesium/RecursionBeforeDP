package Basic;

import java.util.Scanner;

public class factorial {
    public int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else {
            return n * factorial(n - 1);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        factorial factorial = new factorial();
        int solution = factorial.factorial(n);
        System.out.println("factorial for the number = " + n + "is : " + solution);

    }

}