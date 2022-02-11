package com.tutorial;

public class Main6 {
    public static void main(String[] args) {
        System.out.print("\n");
        for (int i = 0; i < 6 ; i++) {
            for (int j = 5; j > i ; j--) {
                System.out.print("- ");
            }
            for (int k = 0; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
