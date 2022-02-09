package com.tutorial;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {

        /*
         formula fibonnacci
        0 1 2 3 4 5 6 7  8  9  10
        0 1 1 2 3 5 8 13 21 34 55

        fn = fibonacci ke - n
        fn = fn-1 + fn-2
        f2 = f 2-1 + f 2-2
        f2 = f1 + f0
        f2 = 1 + 0
        f2 = 1

        fn2 = 0
        fn1 = 1
        fn  = 1

        fn2 = 1
        fn1 = 1
        fn = 2
         */

        // declare variable
        int fn2,fn1,fn,n;

        // make Scanner userInput in variable n
        Scanner userInput = new Scanner(System.in);
        System.out.print("enter until value fibonacci : ");
        n = userInput.nextInt();

        // initialize variable
        fn2 = 0;
        fn1 = 1;
        fn = 1;

        for (int i = 1; i <= n ; i++) {
            System.out.println("value to " + i + " = " + fn);
            fn = fn2 + fn1;
            fn2 = fn1;
            fn1 = fn;
        }

    }
}
