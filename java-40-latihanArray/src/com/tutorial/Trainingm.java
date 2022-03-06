package com.tutorial;
import java.util.*;
public class Trainingm {
    public static void main(String[] args) {
        // join two array
        System.out.println("JOIN ARRAY");
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,10};
        int[] array3 =  new int[10];

        array3 = Arrays.copyOf(array1, 10);
        System.out.println(Arrays.toString(array3));

        for (int i = 0; i < array2.length ; i++) {
            array3[array2.length + i] = array2[i];
        }
        System.out.println(Arrays.toString(array3));

        // addition 2 array
        System.out.println("Addition 2 Array");
        int[] array4 = new int[5];
        for (int i = 0; i <array4.length ; i++) {
            array4[i] = array1[i] + array2[i];
        }
        System.out.println(Arrays.toString(array4));

        System.out.println("Sort reverse array with new variable array");
        int array5[] = new int[5];
        for (int i = 0; i < array1.length ; i++) {
            array5[i] = array1[array1.length-1-i];
        }
        System.out.println(Arrays.toString(array5));

        System.out.println("Sort reverse array with same variable array");

        for (int i = 0; i < array2.length/2 ; i++) {
          int buffer = array2[i];
            array2[i] = array2[(array2.length-1)-i];
            array2[(array2.length-1)-i] = buffer;
        }
        System.out.println(Arrays.toString(array2));


    }
}
