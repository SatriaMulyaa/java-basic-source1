package com.tutorial;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int numberArray[] = {11,12,13,14,15,16,17,18,19,20};
        System.out.println(Arrays.toString(numberArray));

        // looping standard
        System.out.println("===Looping Standard===");
        for (int i = 0; i <10 ; i++) {
            System.out.println("index ke-"+i+" adalah "+numberArray[i]);
        }

        // looping with property array
        System.out.println("===Looping with property array===");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("index ke-"+i+" adalah "+numberArray[i]);
        }

        // looping with foreach
        System.out.println("===looping with foreach===");
        for (var numberArrays : numberArray) {
            System.out.println("angka pada looping ini = " + numberArrays);
        }
    }
}
