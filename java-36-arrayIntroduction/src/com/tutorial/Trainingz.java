package com.tutorial;
import java.util.Arrays;
import java.util.Scanner;
public class Trainingz {
    public static void main(String[] args) {
        System.out.println("ARRAY WITH ASSIGNMENT");
        int[]value = {1,2,3,4,5};
        System.out.println("this is not use library Arrays");
        System.out.print("["+value[0] + ", ");
        System.out.print(value[1] + ", ");
        System.out.print(value[2] + ", ");
        System.out.print(value[3] + ", ");
        System.out.println(value[4]+"]");
        System.out.println("this use library Arrays");
        System.out.println(Arrays.toString(value));
        System.out.println("address location value " + value);
        System.out.println("\n");

        System.out.println("ARRAY WITH DECLARE");
        float[]value1 = new float[5];
        value1[0] = 10.5f;
        value1[1] = 20.5f;
        value1[2] = 7.5f;
        value1[3] = 4.5f;
        value1[4] = 3.5f;
        System.out.println(Arrays.toString(value1));
        System.out.println("address location value1 " + value1);
        System.out.println("\n");

        /*
        this is  experiment
         */
        System.out.println("ARRAY DECLARE WITH USE INPUT CLASS SCANNER");
        Scanner userInput = new Scanner(System.in);
        System.out.print("enter value : ");
        int[]value2 = new int[userInput.nextInt()];
        for (int i = 0; i < value2.length ; i++) {
            System.out.print("enter value : ");
            value2[i] = userInput.nextInt();
        }
        System.out.println(Arrays.toString(value2));
        System.out.println("address location valu2 " + value2);

    }
}
