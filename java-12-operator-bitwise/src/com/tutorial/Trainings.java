package com.tutorial;
import java.util.Scanner;
public class Trainings
{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("input value for convert : " );
        int a = userInput.nextInt();
        String aBinary = String.format("%8s",Integer.toBinaryString(a)).replace(" ", "0");
        System.out.println(aBinary + " (binary)");

        System.out.print("input value for convert : " );
        int b = userInput.nextInt();
        String bBinary = String.format("%8s",Integer.toBinaryString(b)).replace(" ", "0");
        System.out.println(bBinary + " (binary)");

        System.out.println("=====OR=====");
        int c = a | b ;
        String cBinary = String.format("%8s",Integer.toBinaryString(c)).replace(" ", "0");
        System.out.println(cBinary + " (binary)" + " = " + c);

        System.out.println("=====AND=====");
        int d = a & b ;
        String dBinary = String.format("%8s",Integer.toBinaryString(d)).replace(" ", "0");
        System.out.println(dBinary + " (binary)" + " = " + d);

        System.out.println("=====XOR=====");
        int e = a ^ b ;
        String eBinary = String.format("%8s",Integer.toBinaryString(e)).replace(" ", "0");
        System.out.println(eBinary + " (binary)" + " = " + e);

        System.out.println("===SHIFT RIGHT===");
        int x = (d >> 1);
        String fBinary = String.format("%8s",Integer.toBinaryString(x)).replace(" ", "0");
        System.out.println(fBinary + " (binary)" + " = " + x);

        System.out.println("===SHIFT LEFT===");
        int y = (d << 1);
        String gBinary = String.format("%8s",Integer.toBinaryString(y)).replace(" ", "0");
        System.out.println(gBinary + " (binary)" + " = " + y);

        System.out.println("===NOT===");
        int z = ~y;
        String hBinary = String.format("%8s",Integer.toBinaryString(z)).substring(24);
        System.out.println(hBinary + " (binary)" + " = " + z);



    }
}
