package com.tutorial;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // expression in unit (int,long,byte,short),String, atau enum

        String input;

        Scanner userInput = new Scanner (System.in);

        System.out.print("what is your name : ");
        input = userInput.next();

        switch (input){
            case "Otong":
                System.out.println("Yes Oke Boss");
            case "Ucup":
                System.out.println("im Ucup, present boss");
                break;
            case "mario":
                System.out.println("im mario, present boss");
                break;
            default:
                System.out.println(input + " not present bos");
        }
    }
}
