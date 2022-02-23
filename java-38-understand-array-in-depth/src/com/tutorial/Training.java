package com.tutorial;
import java.util.Arrays;
public class Training {
    public static void main(String[] args) {
      int[]array1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(array1));
        System.out.println(" memory address array1 =  " + array1);

        int[]array2 = new int[5];
        System.out.println(" memory address array2 =  " + array2);

        array2 = array1;
        System.out.println(Arrays.toString(array2));
        System.out.println(" memory address array2 Now =  " + array2);

        System.out.println("Change value");
        // change value
        array1[0] = 120;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        array2[2] = 50;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        // try method
        System.out.println("\nTry From Method");
        array(array1);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }

    private static void array(int[] dataArray){
        for(int value : dataArray){
            System.out.println(value);
        }
        dataArray[0] = 450;
        for(int value : dataArray){
            System.out.println(value);
        }
    }
}
