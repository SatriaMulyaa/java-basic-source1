package com.tutorial;
import java.util.Scanner;


public class Trainings {
    public static void main(String[] args) {
        // make object from class Scanner
        Scanner userInput = new Scanner(System.in);
        // length
        System.out.print("enter length : ");
        int length = userInput.nextInt();
        // width
        System.out.print("enter width: ");
        int width = userInput.nextInt();
        // area rectangle
        int area = length*width;
        System.out.println("area rectangle : " + area);
        // height
        System.out.print("enter height: ");
        int height = userInput.nextInt();
        // volume rectangle
        int volume =  area*height;
        System.out.println("volume rectangle : " + volume);
    }
}
