package com.tutorial;
import java.util.*;
public class retraining {
    public static void main(String[] args) {
        // make scanner variable
        Scanner userInput = new Scanner(System.in);
        //declare variable
        float a,b,input;
        char operator;

        // input variable
        System.out.print("add value a : ");
        a = userInput.nextInt();
        System.out.print("add operator : ");
        operator = userInput.next().charAt(0);
        System.out.print("add value b : ");
        b = userInput.nextInt();

        //condition
        if(operator == '+'){
            input = a + b;
            System.out.println(input);
        }else if(operator == '-'){
            input = a - b;
            System.out.println(input);
        }else if(operator == '*'){
            input = a * b;
            System.out.println(input);
        }else if(operator == '/'){
            if(b == 0){
                System.out.println("if value dision 0 will be infinity");
            }else{
                input = a / b;
                System.out.println(input);
            }
        } else {
            System.out.println("operator not found");
        }

    }
}
