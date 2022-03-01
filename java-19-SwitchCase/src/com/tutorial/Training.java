package com.tutorial;
import java.util.Scanner;

public class Training {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("input valueMath : ");
        int input = userInput.nextInt();

        switch (input) {
            case 85, 90, 95, 100 -> System.out.println("Congrats you get A");
            case 80, 70 -> System.out.println("Congrat you get B");
            case 65 -> System.out.println("Congrat you get C");
            default -> System.out.println("you have to repeat next year");
        }
    }
}
