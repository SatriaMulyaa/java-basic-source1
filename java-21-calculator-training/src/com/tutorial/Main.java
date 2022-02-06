package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // a operator b

        float a,b,result;
        char operator;
        Scanner userInput;

        userInput = new Scanner(System.in);

        System.out.print("value a = ");
        a = userInput.nextFloat();
        System.out.print("operator = ");
        operator = userInput.next().charAt(0);
        System.out.print("value b = ");
        b = userInput.nextFloat();

        System.out.println("user Input " + a + " " + operator + " " + b );

        if(operator == '+'){
            // addition
            result = a + b;
            System.out.println("result = " + result);
        }else if(operator == '-'){
            // subtraction
            result = a + b;
            System.out.println("result = " + result);
        }else if(operator == '*'){
            // multiplication
            result = a * b;
            System.out.println("result = " + result);
        }else if(operator == '/'){
            if(b == 0){
                System.out.println("division of 0 result  in infinity");
            }else{
                // division
                result = a / b;
                System.out.println("result = " + result);
            }
        }else{
            System.out.println("operator not found");
        }

    }
}
