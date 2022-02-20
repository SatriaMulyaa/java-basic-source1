package com.tutorial;

public class Trainingzz {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j >=i ; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        for (int i = 1; i <=5 ; i++) {
            for (int j = 5; j>=i; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        for (int i = 1; i <6 ; i++) {
            for (int j = 1; j<6 ; j++) {
                System.out.print("*");
                if((i+j)==6){
                    break;
                }else if(i==j){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        for (int i = 1; i <=5 ; i++) {
            for (int j = 5; j >i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        for (int i = 1; i <=5 ; i++) {
            for (int j = 5; j >i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=(2*i-1) ; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j >=(2*i-5) ; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
