package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // fibonacci
        // declare variable
        int fn_1, fn_2, fn, input;
        // make Scanner variable
        Scanner userInput = new Scanner(System.in);
        System.out.print("enter value ");
        input = userInput.nextInt();
        //initialize
        fn_2 = 0;
        fn_1 = 1;
        fn = 1;
        // make for loop
        System.out.println("for loop");
        for (int i = 1; i <= input ; i++) {
            System.out.println("nilai ke- " + i + " = " + fn);
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
        }
        // while
        System.out.println("While");
        int i = 1;
        while(i <= input){
            System.out.println("nilai ke- " + i + " = " + fn);
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
            i++;
        }
        // do while
        System.out.println("Do while");
        i = 1;
        do{
            System.out.println("nilai ke- " + i + " = " + fn);
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
            i++;
        }while(i <= input);
    }
}
