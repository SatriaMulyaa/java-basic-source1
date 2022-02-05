package com.tutorial;
import java.util.Scanner;
public class example3 {
    public static void main(String[] args) {
            // rectangle area algorithm
            Scanner userInput = new Scanner(System.in);
            int length,width,area;
            System.out.print("Length = " );
            length = userInput.nextInt();
            System.out.print("Width = " );
            width = userInput.nextInt();
            area = length * width;
            System.out.println("area rectangle is " + area);
    }
}
