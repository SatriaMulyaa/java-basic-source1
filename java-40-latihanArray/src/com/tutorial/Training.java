package com.tutorial;

import java.util.Arrays;

public class Training {
    public static void main(String[] args) {
        //  addition between two arrays
        System.out.println("addition between two arrays");
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,10};

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("------------------------- +");
        System.out.println("result = "+Arrays.toString(addition(array1, array2)));

        // join two arrays
        System.out.println("join two arrays");
        join(array1,array2);

        // sorting reverse
        System.out.println("sorting reverse");
        reverse(array1);
        // another sort technic
        System.out.println("\nsorting reverse , another technic");
        int[] array3 = {9,8,7,6,10,20};
        reverse2(array3);

    }

    private static int[] addition(int[] array1, int[] array2){
        int[] arrayHasil = new int[array1.length];
        for (int i = 0; i < array1.length ; i++) {
            arrayHasil[i] = array1[i] + array2[i];
        }
        return arrayHasil;
    }

    private static void join(int[] array1, int[] array2){
        int[] arrayNew = new int[array1.length + array2.length];
        System.out.println("arrayNew = " + Arrays.toString(arrayNew));
        for (int i = 0; i < array1.length ; i++) {
            arrayNew[i] = array1[i];
        }
        System.out.println("arrayNew = " + Arrays.toString(arrayNew));

        for (int i = 0; i <array2.length ; i++) {
            arrayNew[array2.length + i ] = array2[i];
        }
        System.out.println("arrayNew = " + Arrays.toString(arrayNew));
    }

    private static void reverse(int[] dataArray){
        System.out.println(Arrays.toString(dataArray));
        Arrays.sort(dataArray);
        int[]newArray = Arrays.copyOf(dataArray,dataArray.length);
        System.out.println("tes = "+ Arrays.toString(dataArray));
        for (int i = 0; i < dataArray.length; i++) {
            newArray[i] = dataArray[(dataArray.length -1)-i];
        }
        System.out.println("sorting reverse " + Arrays.toString(newArray));
    }

    private static void reverse2(int[] dataArray){
        System.out.println(Arrays.toString(dataArray));
        Arrays.sort(dataArray);
        System.out.println(Arrays.toString(dataArray));
        for (int i = 0; i < dataArray.length / 2 ; i++) {
            int keepArray = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length -1)-i];
            dataArray[(dataArray.length -1) - i ] = keepArray;
        }
        System.out.println(Arrays.toString(dataArray));
    }
}
