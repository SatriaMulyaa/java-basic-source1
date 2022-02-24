package com.tutorial;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("learn multidimensional array ");
        // make multidimensionl 2 array with assignment
        int[][]array2D = {{1,2},{3,4}};
        printArray2D(array2D);
        System.out.print("\n");
        // make multidimensionl 2 array with declare
        int[][]arrayAngka = new int [5][4];
        int[][]ArrayAngkas = {{1,2,3},{4,5,6}};
        // Method auto
        printArray2D(arrayAngka);
        System.out.print("\n");
        // Method manual
        printArray2DMethod2(arrayAngka);

        // Method foreach
        System.out.print("\n");
        printArray2DMethod3(arrayAngka);

        // try
        System.out.print("\n");
        printArray2D(ArrayAngkas);
    }

    private static void printArray2D(int[][] dataArray){
        for (int i = 0; i < dataArray.length ; i++)  {
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }

    private static void printArray2DMethod2(int[][] dataArray){
        for (int i = 0; i < dataArray.length ; i++) {
            System.out.print("[");
            for (int j = 0; j < dataArray[i].length ; j++) {
                System.out.print(dataArray[i][j] + ",");
            }
            System.out.print("]\n");
        }
    }

    private static void printArray2DMethod3(int[][] dataArray){
        for(int[] value : dataArray){
            System.out.print("[");
            for (int values : value){
                System.out.print(values + ",");
            }
            System.out.print("]\n");
        }
    }

}
