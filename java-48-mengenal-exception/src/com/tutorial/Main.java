package com.tutorial;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[]array = {0,1,2,3};
        Scanner userInput  = new Scanner(System.in);
        FileInputStream fileInput = null;
        System.out.print("value array to-");
        int index = userInput.nextInt();

        //exception handling (try,catch,finally)
        System.out.println("handling out of bound");
        try{
            System.out.printf("index to-%d, is %d",index,array[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }

        // runtime error if file not found
        System.out.println("handling IO not found");
        try{
            fileInput = new FileInputStream("input.txt");
        }catch(IOException e){
            System.err.println(e);
        }

        //  join two exception
        System.out.println("join two exception");
        try{
            System.out.printf("index to-%d, is %d\n",index,array[index]);
            fileInput = new FileInputStream("input.txt");
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("the index your entered dont match with amount of array ");
        }catch(IOException e){
            System.err.println("file not found");
        }

        // finally
        System.out.println("add finally ");
        try{
            System.out.printf("index to-%d, is %d\n",index,array[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("the index your entered dont match with amount of array ");
        }finally{
            System.out.println("finally");
        }

        System.out.println("final program");
    }
}
