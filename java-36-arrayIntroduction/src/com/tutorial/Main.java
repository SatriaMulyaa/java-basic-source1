package com.tutorial;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // assignment
        // data type [] name  = {component-component}
        System.out.println("assignment array");
        //           index =  0 1 2 3
        //                    | | | |
        int[] arrayInteger = {1,2,3,4};
        arrayInteger[3] = 12;
        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);
        System.out.println(Arrays.toString(arrayInteger));


        System.out.println("array declare");
        // declare
        float[]arrayFloat = new float[5];
        arrayFloat[3] = 11.5F;

        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);
        System.out.println(Arrays.toString(arrayFloat));

    }
}
