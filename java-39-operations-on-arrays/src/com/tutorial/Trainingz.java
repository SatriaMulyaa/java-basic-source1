package com.tutorial;

import java.util.Arrays;

public class Trainingz {
    public static void main(String[] args) {
        int[] arrayValue1 = {1,2,3,4,5};
        // change array to String
        System.out.println("CHANGE ARRAY TO STRING");
        System.out.println(Arrays.toString(arrayValue1));
        // copy array to array
        System.out.println("COPY ARRAY TO STRING");
        int[] arrayValue2 = new int[5];
        for (int i = 0; i < arrayValue1.length ; i++) {
            arrayValue2[i] =  arrayValue1[i];
        }
        System.out.println(Arrays.toString(arrayValue2));
        // copy array to array with copy of
        System.out.println("Copy ARRAY TO ARRAY WITH COPY OF");
        int[] arrayValue3 = Arrays.copyOf(arrayValue1, 3);
        System.out.println(Arrays.toString(arrayValue3));
        // copy array to array with copy of range
        System.out.println("Copy ARRAY TO ARRAY WITH COPY OF RANGE");
        int[] arrayValue4 = Arrays.copyOfRange(arrayValue1, 2, 4);
        System.out.println(Arrays.toString(arrayValue4));
        // mengfill array with 1 value
        System.out.println("Mengfill array with 1 value");
        int[]arrayValue5 = new int[5];
        Arrays.fill(arrayValue5,1);
        System.out.println(Arrays.toString(arrayValue5));
        //komparasi array with equals
        System.out.println("KOMPARASI ARRAYS with Equals");
        int[] arrayValue6 = {9,1,3,9,5};
        int[] arrayValue7 = {9,2,3,4,5};
        System.out.println(Arrays.toString(arrayValue6));
        System.out.println(Arrays.toString(arrayValue7));
        System.out.println(Arrays.equals(arrayValue6, arrayValue7));
        // check array bigger?
        System.out.println("KOMPARASI ARRAYS with COMPARE");
        int[] arrayValue8 = {1,2,3,4,5};
        int[] arrayValue9 = {1,2,3,4,9};
        System.out.println(Arrays.toString(arrayValue8));
        System.out.println(Arrays.toString(arrayValue9));
        System.out.println(Arrays.compare(arrayValue8, arrayValue9));
        // check different index from array
        System.out.println("KOMPARASI ARRAYS with index Mismatch");
        System.out.println(Arrays.toString(arrayValue8));
        System.out.println(Arrays.toString(arrayValue9));
        System.out.println(Arrays.mismatch(arrayValue8, arrayValue9));
        // sorting and searching array
        System.out.println("SORTING");
        int[] arrayValue10 = {4,8,2,3,0,1};
        System.out.println("Before sorting " + Arrays.toString(arrayValue10));
        Arrays.sort(arrayValue10);
        System.out.println("After sorting " + Arrays.toString(arrayValue10));
        // search array
        int a = 3;
        System.out.println("Search :  " +  a + ", result array = " + Arrays.binarySearch(arrayValue10,3));

    }
}
