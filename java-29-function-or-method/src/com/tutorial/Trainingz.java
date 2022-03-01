package com.tutorial;
import java.util.Scanner;
public class Trainingz {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("input length : ");
        int length  = userInput.nextInt();
        System.out.print("input width : ");
        int breadth = userInput.nextInt();

        Imagerectangle(breadth,length);
        showaAreaAndPerimeter(length,breadth);

    }

    private static void showaAreaAndPerimeter(int length, int breadth){
        System.out.println("area of rectangle : " + areaOfRectangle(length,breadth));
        System.out.println("perimeter of rectangle : " + perimeterOfRectangle(length,breadth));

    }

    private static void Imagerectangle(int breadth, int length){
        for (int i = 0; i < breadth ; i++) {
            for (int j = 0; j < length ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    private static int areaOfRectangle(int length, int width){
     return length*width;
    }

    private static int perimeterOfRectangle(int length, int breadth){
        return 2*(length+breadth);
    }




}
