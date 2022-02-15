package com.tutorial;
import java.util.Scanner;
public class TrainingAgain {
    public static void main(String[] args) {
        // declare
        int a,b;
        Scanner userInput = new Scanner(System.in);
        System.out.print("your score major A : ");
        a = userInput.nextInt();
        System.out.print("your score major B : ");
        b = userInput.nextInt();

        // nested if
        if(a > 80){
            if(b >90){
                System.out.println("you win in major A && B");
            }else{
                System.out.println("you lose in major B BUT win in major A");
            }
        }else{
            System.out.println("sorry you not pass in major A so you cant to major B");
        }

        System.out.println("===if nested again===");
        if(a >= 85){
            System.out.println("your score A");
        }else{
            if(a >= 70){
                System.out.println("your score B");
            }else{
                if(a >= 60){
                    System.out.println("you pass but your score bad");
                }else{
                    System.out.println("you not pass");
                }
            }
        }

    }
}
