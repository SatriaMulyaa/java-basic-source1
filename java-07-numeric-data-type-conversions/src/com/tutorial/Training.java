package com.tutorial;

public class Training {
    public static void main(String[] args) {
        // widening casting
        int variable1 = 10000;
        long variable2 = variable1;
        System.out.println(variable2);
        // narrowing casting
        variable1 = (int)variable2;
        System.out.println(variable1);
        // division with casting
        int vr1 = 10;
        float vr2 = 20;
        float vr3 = vr1 + vr2;
        System.out.println(vr3);
        // example again
        vr1 = 10;
        int vr4 = 20;
        vr3 = (float)vr1 / vr4;
        System.out.println(vr3);
    }
}
