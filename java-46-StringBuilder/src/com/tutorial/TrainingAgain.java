package com.tutorial;
import java.lang.StringBuilder;

public class TrainingAgain {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("hello");
        System.out.println("before");
        printAddress(builder);
        // we do append
        System.out.println("\nafter");
        System.out.println( builder.append(" guys"));
        printAddress(builder);
        System.out.println("\nafter");
        builder.append(" warga jakarta");
        printAddress(builder);

        System.out.println("\n==Insert==");
        builder.insert(16," kota");
        printAddress(builder);

        System.out.println("\n==Delete==");
        builder.delete(16,21);
        printAddress(builder);

        System.out.println("\n==SetCharAt==");
        builder.setCharAt(11, 'z');
        printAddress(builder);

        System.out.println("\n==Replace==");
        builder.replace(6, 10, "teman");
        printAddress(builder);

        System.out.println("\n==Casting be String biasa==");
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int address = System.identityHashCode(kalimat);
        System.out.println(Integer.toHexString(address));

        System.out.println("\n==Casting be String builder again==");
        builder = new StringBuilder(kalimat);
        printAddress(builder);
    }

    private static void printAddress(StringBuilder builder){
        System.out.println("data = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());

        int address = System.identityHashCode(builder);
        System.out.println(Integer.toHexString(address));
    }
}
