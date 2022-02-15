package com.tutorial;
import java.util.Scanner;
public class TrainingAgain {
    public static void main(String[] args) {
        // call Scanner in variable
        Scanner userInput = new Scanner(System.in);
        // declare
        char operator;
        float value1,value2,result;

        // initialize
        System.out.print("enter value1 : ");
        value1 = userInput.nextFloat();
        System.out.print("enter operator : ");
        operator = userInput.next().charAt(0);
        System.out.print("enter value2 : ");
        value2 = userInput.nextFloat();

        // process
        switch(operator){
            case '+':
                result = value1 + value2;
                System.out.println("result : "+ result);
                break;
            case '-':
                result = value1 - value2;
                System.out.println("result : "+ result);
                break;
            case '*':
                result = value1 * value2;
                System.out.println("result : "+ result);
                break;
            case '/':
                result = value1 / value2;
                if(value2 == 0){
                    System.out.println("result will be infinity");
                }else{
                    System.out.println("result : "+ result);
                }
                break;
            case '%':
                result = value1 % value2;
                System.out.println("result : "+ result);
                break;
            default:
                System.out.println("does not recognize operator");
        }
    }
}
