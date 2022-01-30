package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // program for conversions data (from a data type to data type)
        int nilaiInt = 14 ; //bit
        System.out.println("nilai int = " + nilaiInt);

        // Expand the range to a larger data type  (memperluas rentang ke tipe data yang lebih besar)
        long thisLong = nilaiInt;
        System.out.println("value long is " + thisLong);

        // Expand the range to a smaller data type
        byte thisByte = (byte) nilaiInt;
        System.out.println("byte value " + thisByte);
        System.out.println("VALUE MAX BYTE = " + Byte.MAX_VALUE );
        System.out.println("VALUE MAX BYTE = " + Byte.MIN_VALUE );

        // casting pembagian
        int a = 10;
        float b = 4;
        float c = a/b;
        System.out.printf("%d / %f = %f\n",a,b,c);

        // dont like this
        int d = 10;
        int e = 4;
        float f = d/e;
        System.out.printf("%d / %d = %f\n",d,e,f);

        // example etc
        int x = 10;
        int y = 4;
        float z = (float)x / y;
        System.out.printf("%d / %d = %f\n",x,y,z);
    }
}
