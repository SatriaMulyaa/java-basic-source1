package com.tutorial;
import java.util.Scanner;
public class Training {
    public static void main(String[] args) {
        // declare
        float scoreMathematic, scoreAbsent;
        // call Scanner
        Scanner userInput = new Scanner (System.in);
        System.out.print("add your score mathematic : ");
        scoreMathematic = userInput.nextFloat();
        System.out.print("add your score absent : ");
        scoreAbsent = userInput.nextFloat();

        // process
        if(scoreMathematic>=90 && scoreAbsent>=90){
            System.out.println("Your score A");
        }else if(scoreMathematic>80 && scoreAbsent>80){
            System.out.println("Your score B");
        }else{
            System.out.println("im so sorry you not pass ");
        }
    }
}
