package com.tutorial;

public class Trainingzz {
    public static void main(String[] args) {
        System.out.println("===SQUARE===");
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j < 5 ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("\n");

        System.out.println("===RECTANGLE===");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 15 ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("\n");

        System.out.println("===RIGTH TRIANGLE===");
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5 ; j++) {
                System.out.print("*");
                if(i == j){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.println("\n");

        System.out.println("===INVERTED RIGTH TRIANGLE===");
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5 ; j++) {
                System.out.print("*");
                if(j+i==4){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.println("\n");

        System.out.println("====JOIN TRIANGLE right and inverted====");
        for (int i = 0; i < 11 ; i++) {
            for (int j = 0; j < 11 ; j++) {
                System.out.print("*");
                if(i == j){
                    break;
                } else if(i+j==10){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.println("\n");

        System.out.println("Inverted Triangle left");
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k > i ; k--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("\n");

        System.out.println("Triangle left");
        for (int i = 0; i < 5 ; i++) {
            for (int j = 4; j > i ; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        System.out.println("rectangle");
        for (int i = 0; i <5 ; i++) {
            System.out.print("* ");
            for (int j = 0; j < 5 ; j++) {
                if(i == 0 || i == 4){
                    System.out.print("* ");
                } else if(i == 1 || i == 2 || i == 3){
                    System.out.print("  ");
                }
            }
            for (int k = 0; k < 1 ; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        System.out.println("isosceles triangle");
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 5; j > i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k >= 2*i-5 ; k--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 5; j > i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i = 2; i <= 5 ; i++) {
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k >= (2*i-5) ; k--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }


    }
}
