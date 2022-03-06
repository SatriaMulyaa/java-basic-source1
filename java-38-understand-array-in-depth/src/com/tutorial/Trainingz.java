package com.tutorial;
import java.util.Arrays;


public class Trainingz {
    public static void main(String[] args) {
        int[]array1 = {1,2,3,4,5};
        int[]array2 = new int[5];

        array2 = array1;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(array1);
        System.out.println(array2);

        System.out.println("test function");
        changeArray(array1);
        System.out.println("KITA SAMAKAN");
        System.out.println(Arrays.toString(array1));


    }

    private static void changeArray(int[] arrayz){
        System.out.println("before");
        for(int array : arrayz){
            System.out.println(array);
        }
        arrayz[0] = 120;
        System.out.println("after");
        for(int array : arrayz){
            System.out.println(array);
        }
    }
}
