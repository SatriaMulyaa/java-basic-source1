package com.tutorial;

public class Training {
    public static void main(String[] args) {
        // declare and initialize
        int a = 20;
        int b = 10;
        int total = a + b;
        // addition
        System.out.printf("%d + %d = %d\n", a,b,total);
        // subtraction
        total = a - b;
        System.out.printf("%d - %d = %d\n", a,b,total);
        // multiplication
        total = a * b;
        System.out.printf("%d * %d = %d\n", a,b,total);
        // division
        total = a / b;
        System.out.printf("%d / %d = %d\n", a,b,total);
        // modulo
        total = a % b;
        System.out.printf("%d %% %d = %d\n", a,b,total);
    }
}
