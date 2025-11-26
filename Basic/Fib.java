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


// 0. 1. 1. 2. 3. 5. 8. 
        
    }
     static int  foo2(int n ){
        if (n==0 ) {
            return -1;
        }
        if (n==1) return 0 ;
        if (n==2) { return 1 ;
            
        }
        return foo2(n-1)+foo2(n-2);

     }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner .nextInt();
        System.out.println("writing the foo for n = "+n+"where n is iteration ");
    //     System.out.println(0);
    //     System.out.println(1);
    //  //   foo(n , 0 ,1,1);
        System.out.println("calling foo 2 "+
       "" );
        System.out.println(foo2(n));

        



    }

     
}
