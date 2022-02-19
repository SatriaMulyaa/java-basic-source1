package com.tutorial;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[]arrays1 = {1,2,3,4,5};
        int[]arrays2 = new int[5];

        System.out.println(arrays1);
        System.out.println(arrays2);

        arrays2 = arrays1;
        System.out.println("array 1 -> "+Arrays.toString(arrays1));
        System.out.println("array 2 -> "+Arrays.toString(arrays2));

        arrays1[0] = 100;
        System.out.println("array 1 -> "+Arrays.toString(arrays1));
        System.out.println("array 2 -> "+Arrays.toString(arrays2));

        ubah(arrays1);
        System.out.println("array 1 -> "+Arrays.toString(arrays1));
        System.out.println("array 2 -> "+Arrays.toString(arrays2));
    }
    // method yang argumentnya adalah reference, pass by reference
    // bukan pass by value
    static  void ubah(int[] dataArray){
        for(int data : dataArray){
            System.out.println(data);
        }
        dataArray[0] = 125;
        for(int data : dataArray){
            System.out.println(data);
        }
    }
}
