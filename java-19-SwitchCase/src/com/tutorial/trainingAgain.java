package com.tutorial;
import java.util.Scanner;
public class trainingAgain
{
    public static void main(String[] args) {
        // call scanner
        Scanner userInput = new Scanner(System.in);
        System.out.print("enter your name ");
        String name = userInput.next();

        switch(name){
            case "budi":
            System.out.println("hallo " + name);
            break;
            case "unto":
                System.out.println("hello " + name);
                break;
            case "reyn":
                System.out.println("hello " + name);
                break;
            default:
                System.out.println("i dont know you");
        }
    }
}
