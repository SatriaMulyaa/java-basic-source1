package com.tutorial;
import java.util.*;
public class retraining {
    public static void main(String[] args) {

        // declare
        int input,x;
        System.out.println("enter value ");
        Scanner userInput = new Scanner(System.in);
        input = userInput.nextInt();
        x = (input==10) ? input*input : input/2;
        System.out.println(x);
    }
}
