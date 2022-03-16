package com.tutorial;
import java.lang.StringBuilder;
public class Training {
    public static void main(String[] args) {
//        StringBuilder builder = new StringBuilder("hello");
//        printData(builder);
//        String tes1 = "hello";
//        System.out.println(Integer.toHexString(tes1.hashCode()));
//        tes1 = tes1 + " world";
//        System.out.println(Integer.toHexString(tes1.hashCode()));
//        String test2 = "hello world";
//        System.out.println(Integer.toHexString(test2.hashCode()));
        String x = "yes";
        System.out.println(Integer.toHexString(x.hashCode()));
        String y = new String("yes");
        System.out.println(Integer.toHexString(y.hashCode()));
        System.out.println(x==y);

    }

    private static void printData(StringBuilder dataBuilder){
        System.out.println("data : " + dataBuilder);
        System.out.println("kapasitas : " + dataBuilder.capacity());
        System.out.println("panjang : " + dataBuilder.length());

        int address = System.identityHashCode(dataBuilder);
        System.out.println(Integer.toHexString(address));
    }

}
