package com.tutorial;

import java.util.Scanner;

public class Training {
    public static void main(String[] args) {
        System.out.println("===first operation CHARAT===");
        String variable1 = "hello";
        System.out.println(variable1.charAt(0));

        System.out.println("===second operation SUBSTRING===");
        String variable2 = "Hello Guys";
        System.out.println(variable2.substring(0,5));

        System.out.println("===JOIN STRING WITH STRING===");
        String variable3 = "eating";
        String variable4 = variable3 + "banana";
        System.out.println(variable4);
        System.out.println("===JOIN STRING WITH DIFFERENT DATA TYPE");
        int amount = 15000;
        String variable5 = "i buy banana with price " + amount + " rupiah";
        System.out.println(variable5);

        System.out.println("operation lowercase to uppuercase");
        String variable6 = "samehada";
        System.out.println(variable6.toUpperCase());

        System.out.println("operation uppercase to lowercase");
        System.out.println(variable6.toLowerCase());

        System.out.println("operation change sentence");
        String myFavoriteFood1 = "I like banana";
        String myFavoriteFood2 = myFavoriteFood1.replace("banana", "junkfood");
        System.out.println(myFavoriteFood2);

        System.out.println("operation same or not value from string variable");
        System.out.println("compare base on memory address");

        String variable9 = "test";
        String variable10 = "test";

        System.out.println("==result one==");
        if(variable9 == variable10){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }

        String variable11 = new String("test");
        System.out.println("==result two==");
        if(variable10 == variable11){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }

        String variable12 = "test area";
        System.out.println("==result three==");
        String variable13 = variable12.substring(0,4);
        System.out.println(variable13);
        if(variable13 == variable10){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }

        System.out.println("==result four==");
        if(variable13 == variable11){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }

        System.out.println("==result five==");
        Scanner userInput = new Scanner(System.in);
        System.out.print("input test : ");
        String user = userInput.next();

        System.out.println("==Result six==");
        if(user == variable10){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }

        System.out.println("compare base on value");
        String variable20 = "same";
        String variable21 = "same";
        System.out.println("==Result seven==");

        if(variable20.equals(variable21)){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
        System.out.println("==Result eight==");

        if(user.equals(variable10)){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }


        System.out.println("==Result nine==");
        if(variable13.equals(variable10)){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }

        System.out.println("operation seven");
        String food1 = "bakwan";
        String food2 = "gurame";
        System.out.println(food1.compareTo(food2));
        System.out.println(food2.compareTo(food1));

    }
}
