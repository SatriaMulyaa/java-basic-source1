package com.tutorial;
import java.util.Scanner;

public class Training {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        // declare
        int a;
        System.out.print("add your score : ");
        a = userInput.nextInt();

        if(a <= 10 || a>=8){
            System.out.println("your score is good");
        }else{
            System.out.println("your score is not good");
        }
    }
}
