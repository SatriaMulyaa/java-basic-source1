package com.tutorial;

public class TrainingAgain {
    public static void main(String[] args) {
        // convert
        // widening casting
        int a = 10_000;
        long b = a;
        System.out.println(b);
        // narrowing casting
        System.out.println((short)b);
        // division with convert
        int ab = 10;
        float ba = 10.5F;
        float c = ab +ba;
        System.out.println(c);
        int x = 10;
        int y = 3;
        float ca = (float)x / y;
        System.out.println(ca);



    }
}
