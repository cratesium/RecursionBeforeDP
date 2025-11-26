public class Main {

  public static void main(String[] args) {


    for(int i=0 ;i<=60 ;i++){
        test(i);
    }

    // test(0);
    // test(1);
    // test(2);
    // test(3);
    // test(4);
    // test(5);

    // test(10);
    // test(12);
    // test(15);
    // test(20);

    // test(25);
    // test(30);
    // test(35);
    // test(40);
    //    test(41);
    //       test(42);
    //          test(43);
    //             test(44);
    //                test(45);
    //                   test(46);
    //                      test(47);
    //                         test(48);
    //                            test(49);  
    // //

    // // very long 
    // test(50);
    //     test(51);
    //         test(55);
    //             test(60);




}


private static void test(int input) {

    long start = System.nanoTime();

    long result = waysToClimb(input);

    long end = System.nanoTime();

    long timeNs = end - start;
    double timeMs = timeNs / 1_000_000.0;

    System.out.println(
        "Input: " + input +
        " | Result: " + result +
        " | Time: " + timeNs + " ns (" + timeMs + " ms)"
    );
}


   private static int waysToClimb(int n) {
    if (n < 0) {
        return 0;
    }
    if (n == 0) {
        return 1;
    }
    if (n == 1) {
        return 1;
    }
    return waysToClimb(n - 1) + waysToClimb(n - 2);
}

}
