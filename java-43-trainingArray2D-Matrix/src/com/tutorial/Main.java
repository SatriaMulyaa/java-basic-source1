package com.tutorial;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[][] matrixA = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] matrixB = {
                {11,12,13},
                {14,15,16},
                {17,18,19}
        };

        print(matrixA);
        print(matrixB );

        print(tambah(matrixA, matrixB));


        // perkalian
        System.out.println("PERKALIAN");
        int[][]matrixC ={
                {1,2},
                {3,4}

        };

        int[][]matrixD = {
                {5,6},
                {7,8},
        };

        int barisC = matrixC.length;
        int kolomC = matrixC[0].length;

        int barisD = matrixD.length;
        int kolomD = matrixD[0].length;

        int[][]hasil = new int [barisC][kolomD];
        int buffer;
        for (int i = 0; i <barisC ; i++) {
            for (int j = 0; j <kolomD ; j++) {
                buffer = 0;
                for (int k = 0; k <kolomC ; k++) {
                   buffer += matrixC[i][k] * matrixD[k][j];
                }
                hasil[i][j] = buffer;
            }
        }

        print((hasil));
    }

    private static int[][] tambah (int[][] dataArray1, int[][] dataArray2){
        int baris1 = dataArray1.length;
        int kolom1 = dataArray1[0].length;

        int baris2 = dataArray2.length;
        int kolom2 = dataArray2[0].length;

        int[][] hasil = new int[baris1][kolom1];

        //penjumlahan

        if(baris1 == baris2 && kolom1 == kolom2){
            for (int i = 0; i < baris1 ; i++) {
                for (int j = 0; j < kolom1 ; j++) {
                    hasil[i][j] =  dataArray1[i][j] + dataArray2[i][j];
                }
            }
        }else{
            System.out.println("jumlah baris dan kolom tidak sama ");
        }
        return hasil;
    }

    private  static void print(int[][] dataArray){
        int baris = dataArray.length;
        int kolom = dataArray[0].length;

        for (int i = 0; i < baris ; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom ; j++) {
                System.out.print(dataArray[i][j]);
                if(j < (kolom-1) ){
                    System.out.print(" , ");
                }else{
                    System.out.print(" ] ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

}
