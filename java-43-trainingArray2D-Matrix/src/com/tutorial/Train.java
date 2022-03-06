package com.tutorial;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
       Scanner userInput = new Scanner(System.in);
       int[][][] array = new int[2][3][4];
        System.out.println("input nilai dari array 3 dimensi");
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <3 ; j++) {
                for (int k = 0; k <4 ; k++) {
                    System.out.printf("Masukkan array [%d][%d][%d]  : ",i,j,k);
                    array[i][j][k] = userInput.nextInt();
                }
            }
        }
        System.out.print("\n");
        System.out.println("melihat nilai input 3 dimensi ");
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <3 ; j++) {
                for (int k = 0; k <4 ; k++) {
                    System.out.printf("angka index ke [%d][%d][%d] = ",i,j,k);
                    System.out.println(array[i][j][k]);
                }
            }
        }
    }
}
