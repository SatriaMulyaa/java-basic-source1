package com.tutorial;
import java.util.Scanner;

public class Trainingz {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("APP FOR DETERMINE PASS THE EXAM");
        System.out.print("input value absent : ");
        int inputAbsen = userInput.nextInt();
        float totalValueAbsen  = inputAbsen*0.1f;
        System.out.print("input value exam Math : ");
        int inputValueMath = userInput.nextInt();
        float totalValueMath  = inputValueMath*0.9f;


        boolean passTheExam = (totalValueAbsen*10 >= 85 && totalValueMath*10 >= 90);
        System.out.println(passTheExam);
    }
}
