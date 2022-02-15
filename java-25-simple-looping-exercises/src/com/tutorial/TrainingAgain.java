package com.tutorial;
import java.util.Scanner;
public class TrainingAgain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        // declare
        int firstValue;
        int lastValue;
        int total = 0;
        boolean condition = true;
        // process
        System.out.print("input firstValue : ");
        firstValue = userInput.nextInt();
        System.out.print("input lastValue : ");
        lastValue = userInput.nextInt();
        // loop
        while(condition){
            total += firstValue;
            System.out.println("total = "+total + " (firstValue) " + firstValue);
            if(firstValue == lastValue){
                condition = false;
            }
            firstValue++;
        }
    }
}
