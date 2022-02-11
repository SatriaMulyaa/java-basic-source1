package com.tutorial;
public class Training {
    public static void main(String[] args) {
        //nested looping
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10 ; j++) {
                System.out.print("*");
                if(i == j){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10 ; j++) {
                System.out.print("*");
                if((i+j)==9){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        for (int i = 0; i < 11 ; i++) {
            for (int j = 0; j <11 ; j++) {
                System.out.print("*");
                if(i==j){
                    break;
                }else if((i+j)==10){
                    break;
                }
            }
            System.out.print("\n");
        }


        System.out.print("\n");
        for (int i = 0; i < 11 ; i++) {
            for (int j = 10; j > i ; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        for (int i = 1; i < 11 ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int k = 11; k > i ; k--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }


    }
}
