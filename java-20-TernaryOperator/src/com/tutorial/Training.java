package com.tutorial;
import java.util.Scanner;
public class Training {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Add Your score : ");
        int a = userInput.nextInt();
        var pass = a>=80? "congrat your pass" : "your not pass";
        System.out.println(pass);
    }
}
