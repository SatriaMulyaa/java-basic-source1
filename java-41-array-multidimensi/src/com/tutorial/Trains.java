package com.tutorial;
import java.util.Arrays;
public class Trains {
    public static void main(String[] args) {
        System.out.println("ARRAY 2 DIMENSI with ASSIGNMENT");
        int[][]jumlah = {{50,29,45,43},{70,29,25,43,37}};

        System.out.println(jumlah[0][0]);
        System.out.println(jumlah[0][1]);
        System.out.println(jumlah[0][2]);
        System.out.println(jumlah[0][3]);

        System.out.println(jumlah[1][0]);
        System.out.println(jumlah[1][1]);
        System.out.println(jumlah[1][2]);
        System.out.println(jumlah[1][3]);
        System.out.println(Arrays.toString(jumlah));

        System.out.println("ARRAY 2 DIMENSI with DECLARE");
        int[][]array2D = new int[2][5];
        array2D[0][0] = 1;
        array2D[0][1] = 2;
        array2D[0][2] = 3;
        array2D[0][3] = 4;
        array2D[0][4] = 5;
        array2D[1][0] = 6;
        array2D[1][1] = 7;
        array2D[1][2] = 8;
        array2D[1][3] = 9;
        array2D[1][4] = 10;

        System.out.println(array2D[0][0]);
        System.out.println(array2D[0][1]);
        System.out.println(array2D[0][2]);
        System.out.println(array2D[0][3]);
        System.out.println(array2D[0][4]);

        System.out.println(array2D[1][0]);
        System.out.println(array2D[1][1]);
        System.out.println(array2D[1][2]);
        System.out.println(array2D[1][3]);
        System.out.println(array2D[1][4]);
        // ini print address memory header dari array2D
        System.out.println(array2D);
        // ini print adderss memory pada bagian perbaris array
        System.out.println(Arrays.toString(jumlah));


        System.out.println("cara print array 2D dengan looping");
        printArray(array2D);


        System.out.println("\n");
        System.out.println("print manual");
        System.out.println(Arrays.toString(array2D[0]));
        System.out.println("print address");
        System.out.println(array2D[0]);


        System.out.println("print dengan menggunakan fungsi deep toString");
        System.out.println(Arrays.deepToString(array2D));

        System.out.println("cara print array 2D dengan looping with library Arrays");
        for (int i = 0; i < array2D.length ; i++)  {
            System.out.println(Arrays.toString(array2D[i]));
        }

        System.out.println("print array 2 dimensi dengan menggunakan foreach");
        for(int[]arrayValue : array2D ){
            System.out.print("[");
            for(int value : arrayValue){
                System.out.print(value);
            }
            System.out.print("]");
        }
    }

    private static void printArray(int[][]array){
        for (int i = 0; i < array.length ; i++) {
            System.out.print("[");
            for (int j = 0; j < array[0].length ; j++) {
                if(j == 4){
                    System.out.print(array[i][j]);
                }else{
                    System.out.print(array[i][j]+",");
                }
            }
            System.out.print("]");
        }
    }

}
