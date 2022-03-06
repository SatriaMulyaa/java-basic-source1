package com.tutorial;
import java.util.Arrays;


public class Trainingz {
    public static void main(String[] args) {
        // menambahkan dua buah array
        int[]array1 = {1,2,3,4,5,6,7,8,9,10};
        int[]array2 = {1,2,3,4,5,6,7,8,9,10};
        int[]array3 = new int[10];

        for (int i = 0; i <array1.length ; i++) {
            array3[i] = array1[i] + array2[i];
        }

        System.out.println(Arrays.toString(array3));

        // menggabungkan dua buah array
        int[]array4 = {1,2,3,4,5};
        int[]array5 = {6,7,8,9,10};

        int[]array6 = Arrays.copyOf(array4,10);
        System.out.println(Arrays.toString(array6));
        System.out.println(array6);
        for (int i = 0; i < array5.length ; i++) {
            array6[array5.length +i] = array5[i];
        }
        System.out.println(Arrays.toString(array6));
        System.out.println(array6);

        // sorting reverse dua buah array
        int[]array7 = new int[10];
        for (int i = 0; i < array6.length ; i++) {
            array7[i] = array6[(array6.length-1)-i];
        }
        System.out.println(Arrays.toString(array7));
        System.out.println(array7);

        //sorting reverse dengan cara lain
        int buffer;
        for (int i = 0; i < array6.length / 2  ; i++) {
            buffer = array6[i];
            array6[i] = array6[(array6.length-1)-i];
            array6[(array6.length-1)-i] = buffer;
        }
        System.out.println(Arrays.toString(array6));
    }
}
