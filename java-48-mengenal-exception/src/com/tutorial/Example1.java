package com.tutorial;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        int[]array = {1,2,3};
        Scanner userInput = new Scanner(System.in);
        System.out.print("input index: ");
        int input = userInput.nextInt();
//        try{
//            System.out.printf("index to-%d is %d\n",input,array[input]);
//        }catch(ArrayIndexOutOfBoundsException exception){
//            System.err.println(exception);
//        }

        FileInputStream inputStream = null;
//        try{
//            inputStream = new FileInputStream("inputs.txt");
//        }catch(IOException err){
//            System.err.println(err);
//        }

        try {
            System.out.printf("index to-%d is %d",input,array[input]);
            inputStream = new FileInputStream("inputs.txt");
        }catch(ArrayIndexOutOfBoundsException err){
            System.err.print("array index out of bound");
        }catch(IOException io){
            System.err.print("file not found");
        }finally{
            System.out.println("the end");
        }

    }
}
