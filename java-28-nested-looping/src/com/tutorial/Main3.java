package com.tutorial;

public class Main3 {
    public static void main(String[] args) {
        // nested looping
        for (int i = 0; i < 5 ; i++) {
            System.out.print("loop ke - " + i + " ");
            for (int j = 0; j < 5 ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
