package com.tutorial;
import java.util.Scanner;
public class Trainingz {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("nilai awal : ");
        int input1 = userInput.nextInt();
        System.out.print("nilai akhir : ");
        int input2 = userInput.nextInt();

        int total = 0;
        while (input1 <= input2){
            total += input1;
            System.out.println("ditambah " + input1 + " menjadi " + total );
            input1++;
        }

    }
}
