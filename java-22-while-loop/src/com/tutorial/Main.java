package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // while(kondisi){
        // aksi
        // }
        int a = 0;
        boolean condition = true;
        System.out.println("beginning of program");
        while (condition){
            System.out.println("while loop to- " + a);
            a++;

            if(a == 10){
                condition = false;
            }
        }
        System.out.println("the end of program");
    }
}
