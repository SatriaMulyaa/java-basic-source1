package com.tutorial;

public class TrainingAgain {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            System.out.println("one part " + i);
            for (int j = 1; j <=5 ; j++) {
                System.out.println("two part " + j);
                for (int k = 1; k <=5 ; k++) {
                    System.out.println("three part " + k);
                }
            }
        }
    }
}
