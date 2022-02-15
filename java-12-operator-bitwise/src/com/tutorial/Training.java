package com.tutorial;

public class Training {
    public static void main(String[] args) {
        // declare and initialize
        int a,b,c,d;
        a = 10;
        String aBinary,aBinaryShleft,aBinaryShright,vari2;
        // operator bitwise from decimal
        aBinary = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s = %d\n",aBinary,a);
        // operator shift left
        b = (a << 1);
        aBinaryShleft = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
        System.out.printf("%s = %d\n",aBinaryShleft,b);
        // operator shift right
        c = (b >> 1);
        aBinaryShright = String.format("%8s", Integer.toBinaryString(c)).replace(" ", "0");
        System.out.printf("%s = %d\n",aBinaryShright,c);
        System.out.println("===operator OR\n===");
        // operator OR
        d = (a | b);
        vari2 = String.format("%8s", Integer.toBinaryString(d)).replace(" ", "0");
        System.out.printf("%s = %d\n",vari2,d);
        System.out.println("===operator AND===");
        // operator AND
        d = (a & b);
        vari2 = String.format("%8s", Integer.toBinaryString(d)).replace(" ", "0");
        System.out.printf("%s = %d\n",vari2,d);
        System.out.println("===operator XOR===");
        // operator XOR
        d = (a ^ b);
        vari2 = String.format("%8s", Integer.toBinaryString(d)).replace(" ", "0");
        System.out.printf("%s = %d\n",vari2,d);
    }
}
