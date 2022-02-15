package com.tutorial;
import java.util.Scanner;
public class example5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        // declare variable
        int length,width,area,height,volume;
        System.out.print("input length ");
        length = userInput.nextInt();
        System.out.print("input width ");
        width = userInput.nextInt();

        area = length*width;
        System.out.print("area rectangle " + area);
        System.out.print("input height ");
        height = userInput.nextInt();

        volume = area*height;
        System.out.print("volume "+volume);

    }
}
