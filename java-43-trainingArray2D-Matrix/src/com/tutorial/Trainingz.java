package com.tutorial;

public class Trainingz {
    public static void main(String[] args) {
        int[][]array1 = {
                {1,2}, {3,4}, {5,6}
        };
        int[][]array2 = {
                {1,5}, {6,7}, {9,10}
        };
//        addition(array1,array2);
//        print(addition(array1,array2));
        System.out.println("==PENJUMLAHAN==");
        int[][]array3 = {
                {1,2},
                {3,4},
        };
        int[][]array4 = {
                {5,6},
                {7,8},
        };
        print(array3);
        System.out.print("\n");
        print(array4);
        System.out.print("\n");
        System.out.println("RESULT ADDITION");
        print(addition(array3,array4));
        System.out.print("\n");

        System.out.println("==PERKALIAN==");
        int[][]array5 = {
                {1,2},
                {3,4},

        };
        int[][]array6 = {
                {5,},
                {7,},
        };

        print(multiplication(array5,array6));
    }

    private static void print(int[][] dataArray){
        int baris = dataArray.length;
        int kolom = dataArray[0].length;

        for (int i = 0; i <baris; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom ; j++) {
                if(j == (kolom-1)){
                    System.out.print(dataArray[i][j]);
                }else{
                    System.out.print(dataArray[i][j] + ",");
                }
            }

            System.out.println("]");
        }
    }

    private static int[][] addition(int[][] dataArray1, int[][]dataArray2){
        int baris1 = dataArray1.length;
        int kolom1 = dataArray1[0].length;

        int baris2 = dataArray2.length;
        int kolom2 = dataArray2[0].length;

        int[][]hasil = new int[baris1][kolom1];
        // kondisi
        if(baris1 == baris2 && kolom1 == kolom2){
            for (int i = 0; i < baris1 ; i++) {
                for (int j = 0; j <kolom1 ; j++) {
                    hasil[i][j] = dataArray1[i][j] + dataArray2[i][j];
                }
            }
        } else{
            System.out.println("baris dan kolom anda tidak sesuai");
        }
        return hasil;
    }

    private static int[][] multiplication(int[][]dataArray1, int[][]dataArray2){
        int baris1 = dataArray1.length;
        int kolom1 = dataArray1[0].length;
        int baris2 = dataArray2.length;
        int kolom2 = dataArray2[0].length;

        /*
         untuk perkalian kita memiliki kondisi dimana
         syaratnya adalah jumlah kolom array1 sama dengan jumlah baris pada
         array2
         */

        int[][]array7 = new int[baris1][kolom2];
        if(kolom1 == baris2){
            for (int i = 0; i < baris1 ; i++) {
                for (int j = 0; j <kolom2 ; j++) {
                    int buffer = 0;
                    for (int k = 0; k <kolom1 ; k++) {
                        buffer+= dataArray1[i][k] * dataArray2[k][j];
                    }
                    array7[i][j] = buffer;
                }
            }
        }else{
            System.out.println("maaf jumlah kolom pada array1 tidak sama dengan jumlah baris pada array 2");
        }
        return array7;
    }

}
