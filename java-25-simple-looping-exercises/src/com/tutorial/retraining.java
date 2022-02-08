package com.tutorial;
import java.util.*;
public class retraining {
    public static void main(String[] args) {
        int firstValue, finalValue, total;
        Scanner userInput = new Scanner(System.in);
        System.out.print("enter first value = ");
        firstValue = userInput.nextInt();
        System.out.print("enter last value = ");
        finalValue = userInput.nextInt();

        total = 0;
        // while
        System.out.println("===WHILE===");
        while (firstValue <= finalValue){
            total += firstValue;
            System.out.println("add " + firstValue + " be " + total );
            firstValue++;
        }

        //for
        System.out.println("===FOR===");
        int total2 = 0;
        for(int firstValue2 = 1 ;firstValue2 <= 10;firstValue2++){
            total2 += firstValue2;
            System.out.println("add " + firstValue2 + " be " + total2 );
        }

        //do while
        System.out.println("===Do While===");
        int total3 = 0;
        int firstValue3 = 1;
        int finalValue3 = 10;
        do{
            total3 += firstValue3;
            System.out.println("add " + firstValue3 + " be " + total3 );
            firstValue3++;
        }while(firstValue3 <= finalValue3);
    }
}
