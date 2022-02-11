package com.tutorial;
import java.util.Scanner;
public class Training2 {
    public static void main(String[] args) {
        int n;
        Scanner userInput = new Scanner(System.in);
        System.out.print("input pattern length: ");
        n = userInput.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        for (int i = 1; i <= n ; i++) {
            for(int j = n; j >= i ; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i = 1; i <= n ; i++) {
            for (int j = n; j > i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }
            for (int k = n; k >= i ; k--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i = 1; i <= n ; i++) {
            for (int j = n; j > i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i-1) ; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }
            for (int k = n; k >= (2*i-n) ; k--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
