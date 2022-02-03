package com.tutorial;
import java.util.Scanner;
public class example2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        // declare length1, width,large,volume,height
        int length1, width1, area, volume, height;
        //initialize length
        System.out.print("length = ");
        length1 = userInput.nextInt();
        // declare width
        System.out.print("width = ");
        width1 =  userInput.nextInt();
        // declare area
        area = length1 * width1;
        System.out.println("area of a rectangle = " + area);
        // calculate valume
        System.out.print("Height = " );
        height = userInput.nextInt();
        // formula volume of rectangle
        volume  = area * height;
        System.out.println("Volume of rectangle " + volume);
    }
}
