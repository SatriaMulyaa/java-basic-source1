package com.tutorial;

import java.util.Arrays;

public class Training {
    public static void main(String[] args) {

        System.out.println("Array Multidimensi");

        int[][] arrayDimension2 = {
                {1,2,3,4,5},
                {10,20,40,50}
        };
        // header memory
        System.out.println(arrayDimension2);
        // see memory 2 array didalam pembungkus array
        System.out.println(Arrays.toString(arrayDimension2));
        // see fill array multidimensi
        print2D(arrayDimension2);
        System.out.println("sad");
        int[][] arrayValue = {{1,2},{4,5,6}};
        print2D(arrayValue);
        System.out.println("print2DLoop");
        // mengetahui panjang dari sebuah elemen array
        System.out.println(arrayValue[1].length);
//        print2DLoop(arrayValue);
        for (int i = 0; i < arrayValue.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arrayValue[i].length; j++) {
                System.out.print(arrayValue[i][j] + ",");
            }
            System.out.print("]\n");
        }

        System.out.println("===TES===");
        int[][]arrays = new int[][]{{1, 2, 3}, {5, 6, 7}};
        System.out.println(arrays[0][1]);

    }

    private static void print2D(int[][] dataArray){
        System.out.println(Arrays.deepToString(dataArray));
    }

    private static void print2DLoop(int[][] dataArray){
        for (int i = 0; i <dataArray.length ; i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
}
