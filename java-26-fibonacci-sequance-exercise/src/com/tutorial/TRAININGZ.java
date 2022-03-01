package com.tutorial;
import java.util.Scanner;
public class TRAININGZ {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("input nilai batas : ");
        int batas = userInput.nextInt();
        // declare
        int fn = 1;
        int fn_1 = 1;
        int fn_2 = 0;

        for (int i = 1; i <= batas ; i++) {
            System.out.println("f" + i +  " = " + fn);
            fn = fn_2 + fn_1;
            fn_2 = fn_1;
            fn_1 = fn;
        }
    }
}
