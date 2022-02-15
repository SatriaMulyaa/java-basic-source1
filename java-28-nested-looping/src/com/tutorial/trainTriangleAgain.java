package com.tutorial;
import java.util.Scanner;

public class trainTriangleAgain {
    public static void main(String[] args) {
        /*
        1.
        *****
        *****
        *****
        *****
        *****
        2.
        *
        **
        ***
        ****
        *****
        3.
        *****
        -****
        --***
        ---**
        ----*
         4.
        ----*
        ---**
        --***
        -****
        *****
        5.
        *****
        ****-
        ***--
        **---
        *----
        6.
         *
        ***
       *****
      *******
     *********
     7.
     *********
      *******
       *****
        ***
         *
         */
        Scanner userInput = new Scanner(System.in);
        System.out.print("add value : ");
        int input = userInput.nextInt();

        System.out.println("logo number 1");
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=input ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println();

        System.out.println("logo number 2");
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("logo number 3");
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j<i ; j++) {
                System.out.print("-");
            }
            for (int k = input; k >=i ; k--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }


        System.out.println("logo number 4");
        for (int i = 1; i <=input ; i++) {
            for (int j = input; j>i ; j--) {
                System.out.print("-");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("logo number 5");
        for (int i = 1; i <=input ; i++) {
            for (int j = input; j >=i ; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("logo number 6");
        for (int i = 1; i <=input ; i++) {
            for (int j = input; j>i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=(2*i)-1 ; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("logo number 7");
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j<i ; j++) {
                System.out.print("-");
            }
            for (int k = input; k >=(2*i)-input ; k--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("logo number 8");
        for (int i = 1; i <=input ; i++) {
            for (int j = input; j>i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=(2*i)-1 ; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i = 2; i <=input ; i++) {
            for (int j = 1; j<i ; j++) {
                System.out.print("-");
            }
            for (int k = input; k >=(2*i)-input ; k--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }


    }
}
