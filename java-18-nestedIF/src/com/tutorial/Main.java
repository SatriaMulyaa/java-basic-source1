package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // nested if
        int a = 5;
        int b = 6;

        System.out.println("this is beginning from program");
        if(a == 5){
            if(b == 10){
                System.out.println("this is a = 5 and b = 10");
            }else{
                System.out.println("this is a = 5 and b != 10");
            }
        }else{
            System.out.println("this a and b false");
        }

        System.out.println("this is end of program");

    }
}
