import java.util.Scanner;

public class Fib {



    public static void foo(int n , int start1 , int start2 , int itr) {
     System.out.println("interation "+itr);
     
        if (n<itr) {
        return;
        }
        int s3 =start1+start2;
        System.out.println(s3);
        start1=start2;
        start2=s3;
        foo(n, start1, start2, itr+1);



        
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner .nextInt();
        System.out.println("writing the foo for n = "+n+"where n is iteration ");
        System.out.println(0);
        System.out.println(1);
        foo(n , 0 ,1,1);

        



    }

     
}
