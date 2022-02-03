package com.tutorial;
// untuk mengambil semua class atau librar
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // make a object for catch input from user
        Scanner userInput = new Scanner(System.in);
       // write a simple program to guess the numbers
        int trueValue = 6;
        boolean statusGuess;
        System.out.print("input your value guess : ");
        int valueGuess = userInput.nextInt();
        System.out.println("Value guess is " + valueGuess);

        statusGuess = (valueGuess == trueValue);
        System.out.println("your guess is : " + statusGuess);

        // user boolean aljabar operation
        System.out.print("input value between 4 and 9 : ");
        valueGuess = userInput.nextInt();
        statusGuess = (valueGuess > 4) && (valueGuess < 9);
        /*
            a | b | c
            0   0   0
            0   1   0
            1   0   0
            1   1   1
         */
        System.out.println("your guess is " + statusGuess);

    }
}
