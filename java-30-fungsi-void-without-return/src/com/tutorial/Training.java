package com.tutorial;
import java.util.Scanner;
public class Training {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("enter length : ");
        int length = userInput.nextInt();
        System.out.print("enter breadth : ");
        int breadth = userInput.nextInt();
        drawRectangle(length,breadth);
        System.out.println("area : " + areaRectangle(length,breadth));
        System.out.println("perimeter : " + perimeterRectangle(length,breadth));
    }

    static void drawRectangle(int length, int breadth){
        for (int i = 0; i < breadth ; i++) {
            for (int j = 0; j <length ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static int areaRectangle(int length, int breadth){
        int area = length*breadth;
        return area;
    }

    static int perimeterRectangle(int length, int breadth){
        int perimeter = 2*(length+breadth);
        return perimeter;
    }
}
