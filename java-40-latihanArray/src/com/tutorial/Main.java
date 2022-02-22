package com.tutorial;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[]arrayAngka1 = {2,3,5,1,4,7,8,6,8,9};
        int[]arrayAngka2 = {0,4,3,2,1,5,9,8,7,4};

        // addition between two Arrays
        int[] arrayHasil1 = addition(arrayAngka1, arrayAngka2);
        printArray(arrayAngka1,"hasil Array1");
        printArray(arrayAngka2,"hasil Array2");
        printArray(arrayHasil1,"hasil tambah");

        // join 2 arrays
        int[] arrayHasil2 = new int[arrayAngka1.length + arrayAngka2.length];
        for (int i = 0; i < arrayAngka1.length ; i++) {
            arrayHasil2[i] = arrayAngka1[i];
        }
        for (int i = 0; i <arrayAngka2.length ; i++) {
            arrayHasil2[i + arrayAngka1.length] = arrayAngka2[i];
        }
        printArray(arrayAngka1,"hasil");
        printArray(arrayAngka2,"hasil");
        printArray(arrayHasil2,"hasil2");

        // sort array, but reverse
        sort(arrayAngka1);
        printArray(arrayAngka1,"sorted");

        reverse(arrayAngka1);
        printArray(arrayAngka1,"reversed");


        sort(arrayAngka2);
        printArray(arrayAngka2,"sorted array2");
        reverse2(arrayAngka2);
        printArray(arrayAngka2,"reversed");
    }

    private static void sort(int[] dataArray){
        Arrays.sort(dataArray);
    }



    private static void reverse(int[] dataArray){
        Arrays.sort(dataArray);
        int[]arrayBuffer = Arrays.copyOf( dataArray,dataArray.length);
        for (int i = 0; i <dataArray.length ; i++) {
            dataArray[i] = arrayBuffer[((dataArray.length-1) - i)];
        }
    }

    private static void reverse2(int[] dataArray){
        Arrays.sort(dataArray);
        int buffer;

        for (int i = 0; i < dataArray.length/2; i++) {
            buffer = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length-1)-i];
            dataArray[(dataArray.length-1)-i] = buffer;
        }
    }

    private static int[] addition(int[] arrayInt1, int[] arrayInt2){
        int[]arrayHasil = new int[arrayInt1.length];
        for (int i = 0; i < arrayInt1.length ; i++) {
            arrayHasil[i] = arrayInt1[i] + arrayInt2[i];
        }
        return arrayHasil;
    }

    private static void printArray(int[] dataArray, String message){
        System.out.println(message + " = " +Arrays.toString(dataArray));
    }
}
