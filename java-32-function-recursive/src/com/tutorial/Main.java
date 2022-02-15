package com.tutorial;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("enter value : ");
        int input = userInput.nextInt();
        System.out.println("you enter value  : " + input);

//        printValue(input);
        System.out.println(factorial(input));
//        numberValue(input);
    }

//    private static int numberValue(int value){
//        System.out.println("parameter = " + value);
//        return value + numberValue(value - 1);
//    }

    private static void printValue(int value){
        System.out.println("value = " + value);
        value--;
        if(value == 0){
            return;
        }
        printValue(value);

    }

    private static int factorial(int value){
        if(value == 1){
            return value;
        }
        return value * factorial(value-1);
    }



}
