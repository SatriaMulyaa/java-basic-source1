package com.tutorial;
import java.util.Scanner;
public class Trainings {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("enter data : ");
        int input = userInput.nextInt();
        recursive(input);
        System.out.println(addition(input));
        System.out.println(factorial(input));
    }

    static void recursive(int parameter){
        System.out.println("print - " + parameter);
        if(parameter == 0){
            return;
        }
        parameter--;
        recursive(parameter);
    }

    static int addition(int parameter){
        if(parameter == 0){
            return parameter;
        }
        return parameter + addition(parameter-1);
    }

    static int factorial(int parameter){
        if(parameter == 1){
            return parameter;
        }
        return parameter * factorial(parameter-1);
    }

}
