package com.tutorial;
import java.util.Scanner;
public class fibonaci {
    public static void main(String[] args) {
        /*
         -> fn    0 1 2 3 4 5 6 7  8   9  10
         -> value 0 1 1 2 3 5 8 13 21 34  55
         fn = fn_1 + fn_2
         fn4 = f4-1 + f4-2
         fn4 = fn3 + fn2
         fn4 = 2 + 1
         fn4 = 3

         so formula true
            fn_2 = 0;
            fn_1 = 1;
            fn = 1;

            fn_2 = 1;
            fn_1 = 1;
            fn = 2;
         */
        // declare
        int fn,fn_2,fn_1;
        // initialize
        fn = 1;
        fn_1 = 1;
        fn_2 = 0;
        // call Scanner
        Scanner userInput = new Scanner(System.in);
        System.out.print("inplut value ");
        int input = userInput.nextInt();
        // process
        for (int i = 1; i <=input ; i++) {
            System.out.println("fobonacci to - " + i + " = " + fn);
            fn = fn_2 + fn_1;
            fn_2 = fn_1;
            fn_1 = fn;
        }
    }
}
