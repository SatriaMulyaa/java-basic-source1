package com.tutorial;
import java.util.Scanner;
public class Training {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("silahkan masukan batas deret : ");
        int input = userInput.nextInt();
        // declare
        int fn,fn_1,fn_2;
        fn = 1;
        fn_1 = 1;
        fn_2 = 0;
        // for
        for (int i = 1; i <= input ; i++) {
            System.out.println("fibonacci ke - " + i + " = " + fn );
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
        }
        System.out.print("\n");
        // while
        int i = 1;
        while(i<=input){
            System.out.println("fibonacci lanjutan " + " = " + fn );
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
            i++;
        }
        System.out.print("\n");
        // do while
        int a = 1;
        do{
            System.out.println("fibonacci lanjutan " + " = " + fn );
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
            a++;
        }while(a<=input);
    }
}
