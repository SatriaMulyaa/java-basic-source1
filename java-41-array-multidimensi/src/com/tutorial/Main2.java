package com.tutorial;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("******************************");
        System.out.println("****** MATRIKS ORDO 2X4 ******");
        System.out.println("******************************");

        System.out.println("menampilkan matriks ordo 2x4");
        int[][]matrixOrdo2x4 = {{1,2,3,4,5}, {6,7,8,9,10}};
        System.out.println(matrixOrdo2x4.length);

        System.out.println("TES");
        for (int i = 0; i < matrixOrdo2x4.length ; i++) {
            System.out.print("{");
            for (int j = 0; j < matrixOrdo2x4[0].length ; j++) {
                if(j == 4){
                    System.out.print(matrixOrdo2x4[i][j]);
                }else{
                    System.out.print(matrixOrdo2x4[i][j]+",");
                }
            }
            System.out.println("}");
        }
      }

    }

