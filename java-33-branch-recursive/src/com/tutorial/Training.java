package com.tutorial;
import java.lang.String;
import java.util.Scanner;
public class Training {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("enter fibonacci series limit : ");
        int input = userInput.nextInt();
        System.out.println( "fibonacci ke " + input + " = " +  branchFibonacci(input, "atas"));
        int j = 1;
        for (int i = 1; i <=input ; i++) {
            System.out.println("f_" + i + " : " +  fibonacci(j));
            j++;
        }

    }

    static int branchFibonacci(int n, String daun){
        System.out.println(daun);
        if(n == 1 | n == 0){
            System.out.println(n);
            return n;
        }
        System.out.println(n);
        return branchFibonacci(n-1, "kiri") +  branchFibonacci(n-2, "kanan");
    }

    static int fibonacci(int n ){
        if(n == 1 | n == 0){
            return n;
        }
        return fibonacci(n-1) +  fibonacci(n-2);
    }
}
