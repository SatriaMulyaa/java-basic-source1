package com.tutorial;

public class Training {
    public static void main(String[] args) {
        // OR
        System.out.println("===OR===");
        boolean a = true;
        boolean b = false;
        boolean c = a || b;
        System.out.println(c);
        a = false;
        b = true;
        c = a ||  b;
        System.out.println(c);
        a = false;
        b = false;
        c = a || b;
        System.out.println(c);
        a = true;
        b = true;
        c = a || b;
        System.out.println(c);
        // AND
        System.out.println("===AND===");
        a = true;
        b = false;
        c = a && b;
        System.out.println(c);
        a = false;
        b = true;
        c = a && b;
        System.out.println(c);
        a = false;
        b = false;
        c = a && b;
        System.out.println(c);
        a = true;
        b = true;
        c = a && b;
        System.out.println(c);
        // XOR
        System.out.println("===XOR===");
        a = true;
        b = false;
        c = a ^ b;
        System.out.println(c);
        a = false;
        b = true;
        c = a ^ b;
        System.out.println(c);
        a = false;
        b = false;
        c = a ^ b;
        System.out.println(c);
        a = true;
        b = true;
        c = a ^ b;
        System.out.println(c);
        System.out.println("===NEGASI===");
        a = true;
        System.out.println(!a);
    }
}
