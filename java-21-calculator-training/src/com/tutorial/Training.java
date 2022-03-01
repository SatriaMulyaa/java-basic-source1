package com.tutorial;
import java.util.Scanner;

public class Training {
    public static void main(String[] args) {
        float total;
        Scanner userInput = new Scanner(System.in);
        System.out.print("enter value 1 : ");
        float value1 = userInput.nextFloat();

        System.out.print("enter operator : ");
        char operator = userInput.next().charAt(0);

        System.out.print("enter value 2 : ");
        float value2 = userInput.nextFloat();

        switch(operator){
            case '+' -> {
                total = value1 + value2;
                System.out.println("result = " + total);
            }
            case '-' -> {
                total = value1 - value2;
                System.out.println("result = " + total);
            }
            case '*' -> {
                total = value1 * value2;
                System.out.println("result =  " + total);
            }
            case '/' -> {
                total = value1 / value2;
                System.out.println("result = " + total);
            }
            case '%' -> {
                total = value1 % value2;
                System.out.println("result = " + total);
            }
            default -> System.out.println("sorry operator is not found");
        }
    }
}
