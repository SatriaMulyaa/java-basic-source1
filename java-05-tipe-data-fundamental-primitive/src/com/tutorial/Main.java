package com.tutorial;

public class Main {
    public static void main(String[] args){
        // type data di java:
        // integer, byte, short, long, double, float, char, boolean

        //byte
        byte b = 10;
        System.out.println("======Byte====== ");
        System.out.println("value of byte b = " + b);
        //  find the maximum of the byte data  type
        System.out.println("max value of  b = " + Byte.MAX_VALUE);
        System.out.println("min value of byte b = " + Byte.MIN_VALUE);
        // we can check size memory of byte type with bytes
        System.out.println("value of byte b = " + Byte.BYTES + " bytes");
        // we can check size memory of byte type with bit
        System.out.println("value of bit b = " + Byte.SIZE + " bit");

        //short
        short s = 10;
        System.out.println("======Short====== ");
        System.out.println("value of short s = " + s);
        //  find the maximum of the short data type
        System.out.println("max value of short s = " + Short.MIN_VALUE);
        System.out.println("min value of short s = " + Short.MAX_VALUE);
        // we can check size memory of short type with bytes
        System.out.println("value of bytes s = " + Short.BYTES + " bytes");
        // we can check size memory of short type with bit
        System.out.println("value of bit s = " + Short.SIZE + " bit");

        //integer
        int i = 10;
        System.out.println("======Integer====== ");
        System.out.println("value of integer i = " + i);
        //  find the maximum of the integer data type
        System.out.println("max value of  i = " + Integer.MAX_VALUE);
        System.out.println("min value of integer i = " + Integer.MIN_VALUE);
        // we can check size memory of integer type with bytes
        System.out.println("value of bytes i = " + Integer.BYTES + " bytes");
        // we can check size memory of integer type with bit
        System.out.println("value of bit i = " + Integer.SIZE + " bit");

        //float (koma)
        float f = 10f;
        System.out.println("======Integer====== ");
        System.out.println("value of float f = " + f);
        //  find the maximum of the float data type
        System.out.println("max value of  f = " + Float.MAX_VALUE);
        System.out.println("min value of float f = " + Float.MIN_VALUE);
        // we can check size memory of float type with bytes
        System.out.println("value of bytes f = " + Float.BYTES + " bytes");
        // we can check size memory of float type with bit
        System.out.println("value of bit f = " + Float.SIZE + " bit");

        //double
        double d = 10d;
        System.out.println("======Double====== ");
        System.out.println("value of double d = " + d);
        //  find the maximum of the double data type
        System.out.println("max value of  d = " + Double.MAX_VALUE);
        System.out.println("min value of double d = " + Double.MIN_VALUE);
        // we can check size memory of double type with bytes
        System.out.println("value of bytes d = " + Double.BYTES + " bytes");
        // we can check size memory of double type with bit
        System.out.println("value of bit d = " + Double.SIZE + " bit");

        //char
        char c = 'c';
        System.out.println("======Char======");
        System.out.println("value of char c = " + c);
        //  find the maximum of the char data type
        System.out.println("max value of  c = " + Character.MAX_VALUE);
        System.out.println("min value of char c = " + Character.MIN_VALUE);
        // we can check size memory of char type with bytes
        System.out.println("value of char c = " + Character.BYTES + " bytes");
        // we can check size memory of char type with bit
        System.out.println("value of char c = " + Character.SIZE + " bit");

        //boolean
        boolean bl = true;
        System.out.println("======Char======");
        System.out.println("value of char bl = " + bl);
        //  find the maximum of the char data type
        System.out.println("max value of  bl = " + Boolean.TRUE);
        System.out.println("min value of bl = " + Boolean.FALSE);
    }
}
