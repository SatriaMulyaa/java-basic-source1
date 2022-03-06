package com.tutorial;
import java.util.Scanner;
import java.util.Arrays;

public class TrainingPart3 {
    public static void main(String[] args) {
        System.out.println("Menambahkan array baru Part I Declare");
        int[]array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println("memory address : " + array1);

        System.out.println("Menambahkan array baru Part II Assignment");
        int[]array2 = {1,2,3,4,5};
        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);
        System.out.println(array2[3]);
        System.out.println(array2[4]);
        System.out.println("memory address : " + array2);


        System.out.println("Menambahkan array baru Part III tanpa fungsi ");
        System.out.print("input amount element array : ");
        Scanner userInput = new Scanner(System.in);

        int input = userInput.nextInt();
        int[]array = new int[input];

        for (int i = 0; i <array.length ; i++) {
            System.out.print("input data : " );
            array[i] = userInput.nextInt();
        }

        System.out.println(Arrays.toString(array));
        System.out.println("memory address : " + array);

        System.out.println("\n");
        System.out.println("Menambahkan array baru Part III with function ");
        int[]array8 = new int[10];
        inputArray(array8);

    }

    private static void inputArray(int[] array){
//        System.out.print("input amount element array : ");
        Scanner userInput = new Scanner(System.in);
//        int input = userInput.nextInt();
//        array = new int[input];

        for (int i = 0; i <array.length ; i++) {
            System.out.print("input data : " );
            array[i] = userInput.nextInt();
        }

        System.out.println(Arrays.toString(array));
        System.out.println("memory address : " + array);
    }
}
