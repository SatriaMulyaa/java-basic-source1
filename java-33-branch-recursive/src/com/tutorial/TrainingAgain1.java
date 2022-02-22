package com.tutorial;
import java.util.*;
//import java.lang.String;

public class TrainingAgain1 {
    public static void main(String[] args) {
        // Scanner
        Scanner userInput = new Scanner(System.in);
        System.out.print("fibonacci ke : ");
        int n = userInput.nextInt();
        int fibonacci = fibonacci(n, "atas");
        System.out.println("nilai fibonacci ke-" + n + " = " + fibonacci );

    }
    static int fibonacci(int n, String daun){
        System.out.println("nilai " + n);
        System.out.println(daun);
        if(n==1 || n==0){
            return n;
        }
       return fibonacci(n-1, "kiri") + fibonacci(n-2, "kanan");
    }
}
/*
rumus fibonacci :

fn ->    0 1 2 3 4 5 6 7  8  9   10
value -> 0 1 1 2 3 5 8 13 21 34  55

fn = fn_1 + fn_2
f3 = f3_1 + f3_2
f3 = f2 + f1
f3 =  1 + 1
f3 = 2

     3
    2 1
    1 0
 */
