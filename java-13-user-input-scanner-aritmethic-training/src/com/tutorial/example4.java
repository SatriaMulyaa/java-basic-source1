package com.tutorial;
import java.util.*;
public class example4 {
    public static void main(String[] args) {
        // call Scanner
        Scanner userInput = new Scanner(System.in);
        //declare
        int length,width,area,height,volume;
        //input length
        System.out.print("fill length value = ");
        length = userInput.nextInt();
        //input width
        System.out.print("fill width value = ");
        width = userInput.nextInt();
        // process area
        area = length*width;
        // output area
        System.out.println("area = " + area);

        // input height
        System.out.print("fill height value = ");
        height = userInput.nextInt();
        volume = area*height;
        System.out.println("volume = " + volume);
    }
}
