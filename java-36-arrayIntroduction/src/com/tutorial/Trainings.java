package com.tutorial;

import java.util.Arrays;

public class Trainings {
    public static void main(String[] args) {
        System.out.println("===EXAMPLE 1===");
        int[]tes = {1,2,3};
        System.out.println(tes[0]);
        System.out.println(tes[1]);
        System.out.println(tes[2]);

        System.out.println("\n");

        System.out.println("===EXAMPLE 2===");
        int[]array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);

        System.out.println("\n");

        System.out.println("===EXAMPLE 3===");
        float[]array2 = new float[3];
        array2[0] = 1.8f;
        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);

        System.out.println("\n");

        System.out.println("===EXAMPLE 4===");

        System.out.println(Arrays.toString(tes));

    }
}
