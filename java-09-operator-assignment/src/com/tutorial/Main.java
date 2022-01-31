package com.tutorial;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        a = a + 5;
        a = a + 10;
        System.out.println("result of value variable A become = " + a);

        // assignment operator addition
        int b = 1;
        b += 10;
        System.out.println(b);

        // assignment operator subtraction
        int c = 100;
        c -= 25;
        System.out.println(c);

        // assignment operator division
        int d = 100;
        d /= 25;
        System.out.println(d);

        // assignment operator multiplication
        int e = 100;
        e *= 25;
        System.out.println(e);

        // assignment operator modulus
        int f = 100;
        f %= 25;
        System.out.println(f);

    }
}
