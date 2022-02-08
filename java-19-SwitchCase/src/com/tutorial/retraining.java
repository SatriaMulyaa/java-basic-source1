package com.tutorial;
import java.util.*;

public class retraining {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("enter name : ");
        String a = userInput.next();

        switch(a){
            case "anton":
                System.out.println("yes you select anton");
                break;
            case "Otong":
                System.out.println("yes you select Otong");
                break;
            default:
                System.out.println("no.. you not select anyone");
        }

    }
}
