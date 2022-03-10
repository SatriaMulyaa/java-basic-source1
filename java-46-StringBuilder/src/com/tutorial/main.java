package com.tutorial;
import java.lang.StringBuilder;

public class main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("halo");
        print(builder);

        // append
        System.out.println("\n");
        builder.append(" semuanya");
        print(builder);

        // append lagi
        System.out.println("\n");
        builder.append(" warga jakarta");
        print(builder);

        // insert
        System.out.println("\n");
        builder.insert(19, " kota");
        print(builder);

        // delete
        System.out.println("\n");
        builder.delete(19,24);
        print(builder);

        // change character at a certain index
        System.out.println("\n");
        builder.setCharAt(14, 'W');
        print(builder);

        // replace
        System.out.println("\n");
        builder.replace(20,27, "bandung");
        print(builder);

        // casting builder to string
        System.out.println("\n");
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int addressString = System.identityHashCode(kalimat);
        System.out.println(Integer.toHexString(addressString));
    }

    private static void print(StringBuilder dataBuilder){
        System.out.println("data = " + dataBuilder);
        System.out.println("length = " + dataBuilder.length() );
        System.out.println("capacity = " + dataBuilder.capacity());
        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = "+Integer.toHexString(addressBuilder));
    }
}
