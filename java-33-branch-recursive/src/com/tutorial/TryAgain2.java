package com.tutorial;
import java.util.Scanner;
public class TryAgain2 {
    public static void main(String[] args) {
        int j = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.print("batas deret fibonacci : ");
        int n = userInput.nextInt();
        for (int i = 0; i <=n ; i++) {
            System.out.println("f_" + i + " : " + fibonacci(j) );
            j++;
        }
    }
    static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
