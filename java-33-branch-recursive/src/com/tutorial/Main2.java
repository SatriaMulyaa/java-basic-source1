package com.tutorial;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int n,i,j = 0;
        System.out.print("batas deret : ");
        n = userInput.nextInt();
        System.out.print("Deret Fibonacci : \n");
        for (i = 0; i <=n ; i++) {
            System.out.print("f_ " + i + " : ");
            System.out.print("f : "+fibonacci(j)+"\n");
            j++;
        }
    }

    static int fibonacci(int n){
        if(n == 0 || n == 1){
            System.out.println("proses + "+n);
            return n;
        } else {
            System.out.println("proses "+n);
            return fibonacci(n-1) + fibonacci (n-2);
        }
    }

}
