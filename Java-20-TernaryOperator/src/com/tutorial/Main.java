package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ternary operator

        int input,x;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukan Nilai ");
        input = userInput.nextInt();

        // variable x = expression ? statement_true : statement_false;
        x = (input == 10) ? (input*input) : (input/2);

//        if with ifStatement
//        if(x == 10){
//            x = input*input;
//        }else{
//            x = input/2;
//        }

        System.out.println("result " + x);
    }
}
