package com.tutorial;

public class Main {
    public static void main(String[] args) {
        System.out.println("beginning of program");
        // declare and initialize variable
        int last = 10;
        int total = 0;
        // looping condition
        for (int first = 0; first <= last ; first++) {
            System.out.println("value first = " + first);
            total += first;
            System.out.println("total = " + total);
        }
        System.out.println("ending of program");

    }
}
