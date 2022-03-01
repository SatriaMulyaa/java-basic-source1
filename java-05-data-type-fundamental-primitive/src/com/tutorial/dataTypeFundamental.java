package com.tutorial;

import com.sun.jdi.BooleanValue;

public class dataTypeFundamental {
    public static void main(String[] args) {
        // byte
        System.out.println("===BYTE====");
        byte a = 10;
        System.out.println("value a = " + a );
        System.out.println("MAX Value DataType byte  " + Byte.MAX_VALUE);
        System.out.println("MIN Value DataType byte  " + Byte.MIN_VALUE);
        System.out.println("Size BYTE data type byte = " + Byte.BYTES + " byte");
        System.out.println("Size BIT data type byte = " + Byte.SIZE + " bit");
        // short
        System.out.println("===SHORT====");
        short b = 100;
        System.out.println("value b = " + b );
        System.out.println("MAX Value DataType Short  " + Short.MAX_VALUE);
        System.out.println("MIN Value DataType Short  " + Short.MIN_VALUE);
        System.out.println("Size BYTE data type Short = " + Short.BYTES + " byte");
        System.out.println("Size BIT data type byte = " + Short.SIZE + " bit");
        // integer
        System.out.println("===Integer====");
        int c = 200;
        System.out.println("value c = " +c );
        System.out.println("MAX Value DataType Integer  " + Integer.MAX_VALUE);
        System.out.println("MIN Value DataType Integer  " + Integer.MIN_VALUE);
        System.out.println("Size BYTE data type Integer = " + Integer.BYTES + " byte");
        System.out.println("Size BIT data type byte = " + Integer.SIZE + " bit");
        // long
        System.out.println("===LONG====");
        long d = 300L;
        System.out.println("value d = " + d );
        System.out.println("MAX Value DataType Long  " + Long.MAX_VALUE);
        System.out.println("MIN Value DataType Long  " + Long.MIN_VALUE);
        System.out.println("Size BYTE data type Long = " + Long.BYTES + " byte");
        System.out.println("Size BIT data type byte = " + Long.SIZE + " bit");
        // float
        System.out.println("===FLOAT====");
        float e = 10.5F;
        System.out.println("value e = " + e );
        System.out.println("MAX Value DataType Float  " + Float.MAX_VALUE);
        System.out.println("MIN Value DataType Float  " + Float.MIN_VALUE);
        System.out.println("Size BYTE data type Float = " + Float.BYTES + " byte");
        System.out.println("Size BIT data type byte = " + Float.SIZE + " bit");
        // double
        System.out.println("===DOUBLE====");
        double f = 2030.7D;
        System.out.println("value f = " + f );
        System.out.println("MAX Value DataType Double  " + Double.MAX_VALUE);
        System.out.println("MIN Value DataType Double  " + Double.MIN_VALUE);
        System.out.println("Size BYTE data type Double = " + Double.BYTES + " byte");
        System.out.println("Size BIT data type byte = " + Double.SIZE + " bit");
        // boolean
        System.out.println("===BOOLEAN====");
        boolean truth = true;
        boolean wrong = false;
        System.out.println(Boolean.valueOf(truth));
        System.out.println(Boolean.valueOf(wrong));
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);

        //Char
        System.out.println("===CHAR===");
        char ai = 'a';
        System.out.println(ai);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.BYTES  + " byte");
        System.out.println(Character.SIZE + " bit");
    }
}
