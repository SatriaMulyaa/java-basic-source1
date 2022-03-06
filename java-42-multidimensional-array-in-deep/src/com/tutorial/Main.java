package com.tutorial;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][]array2D = {{1,2,3},{4,5,6}};

        System.out.println(array2D);
        System.out.println(Arrays.toString(array2D));
        System.out.println(array2D[0]);
        System.out.println(array2D[1]);
        System.out.println("\n");

        char[] arrayChar1 = {'a','b','c'};
        char[] arrayChar2 = {'d','e','f'};

        char[][] arrayChar = {arrayChar1,arrayChar2};

        System.out.println(arrayChar);
        System.out.println(Arrays.toString(arrayChar));
        // kalau di char akan mengeluarkan valuenya langsung
        System.out.println(arrayChar[0]);
        System.out.println(arrayChar[1]);
        char[][] charz = {{'a','b','c'},{'d','e','f'}};
        System.out.println(charz[0]);
        System.out.println(charz[1]);
        System.out.println(array2D[1]);

        // to see memory each array in array with data type char
        System.out.println(Integer.toHexString(System.identityHashCode(arrayChar1)));
        System.out.println(Integer.toHexString(System.identityHashCode(arrayChar2)));
    }
}
