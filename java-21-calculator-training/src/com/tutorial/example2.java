package com.tutorial;
// import java util
import java.util.Scanner;
public class example2 {
    public static void main(String[] args) {
        // variable
        float valueA,valueB,result;
       String operator;

        //declare scanner class with variable
        Scanner userInput = new Scanner(System.in);
        // initialize variable with class scanner
        System.out.print("fill value A = " );
        valueA = userInput.nextFloat();
        System.out.print("fill operator = " );
        operator = userInput.next();
        System.out.print("fill value B = " );
        valueB = userInput.nextFloat();
        // switch case logic
        switch (operator){
            case "+":
                result = valueA + valueB;
                System.out.println("result = " + result);
                break;
            case "-":
                result = valueA - valueB;
                System.out.println("result = " + result);
                break;
            case "*":
                result = valueA * valueB;
                System.out.println("result = " + result);
                break;
            case "/":
                if(valueB == 0){
                    System.out.println("result division 0 will be infinity");
                }else{
                    result = valueA / valueB;
                    System.out.println("result = " + result);
                }
                break;
            default:
                System.out.println("operator not found");
        }

    }
}
