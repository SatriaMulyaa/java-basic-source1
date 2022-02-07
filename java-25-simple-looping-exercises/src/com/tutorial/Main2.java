package com.tutorial;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("answer from open class");
        // program for adding numbers with a range
        int initialValue,lastValue,total;

        Scanner userInput = new Scanner(System.in);
        System.out.print("enter your initial value = ");
        initialValue = userInput.nextInt();
        System.out.print("enter your last value = ");
        lastValue = userInput.nextInt();

        total = 0;
        while(initialValue <= lastValue){
            total = total + initialValue;
            System.out.println("add " + initialValue + " be " + total);
            initialValue++;
        }

        // example2 FOR program
        System.out.println("===EXAMPLE 2===");
        int initialValue2,lastValue2,total2;
        Scanner userInput2  = new Scanner(System.in);
        System.out.print("initial value = " );
        initialValue2 = userInput.nextInt();
        System.out.print("last value = ");
        lastValue2 = userInput.nextInt();

        total2 = 0;
        for (; initialValue2 <= lastValue2 ; initialValue2++) {
            total2 += initialValue2;
            System.out.println("add " + initialValue2 + " be " + total2 );
        }


        // example3 Do While program
        System.out.println("===EXAMPLE 3===");
        int initialValue3,lastValue3,total3;
        Scanner userInput3  = new Scanner(System.in);
        System.out.print("initial value = " );
        initialValue3 = userInput.nextInt();
        System.out.print("last value = ");
        lastValue3 = userInput.nextInt();

        total3 = 0;
        do{
            total3+= initialValue3;
            System.out.println("add " + initialValue3 + " be " + total3) ;
            initialValue3++;
        }while(initialValue3 <= lastValue3);

    }
}
