package com.tutorial;
import  java.util.*;
public class Training {
    public static void main(String[] args) {
        //Scanner input
        Scanner userInput = new Scanner(System.in);
        // DECLARE
        int valueA;
        System.out.print("input value A : ");
        valueA = userInput.nextInt();

        var booleanTrue = (valueA >= 6 &&  valueA <=10);
        System.out.println(booleanTrue);

    }
}
