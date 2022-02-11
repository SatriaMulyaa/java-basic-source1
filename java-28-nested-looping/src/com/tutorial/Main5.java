package com.tutorial;

public class Main5 {
    public static void main(String[] args) {
        // nested looping
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 0; j < 5 ; j++) {
                if (j == i){
                    break;
                }
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
