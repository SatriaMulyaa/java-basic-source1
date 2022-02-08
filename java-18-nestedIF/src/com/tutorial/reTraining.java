package com.tutorial;
import java.util.Scanner;
public class reTraining {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int a,b;
        System.out.print("fill value a : " );
        a = userInput.nextInt();
        System.out.print("fill value b : " );
        b = userInput.nextInt();
        if(a == 5){
            if(b == 10){
                System.out.println("yes true a = 5 and b = 10 ");
            }else{
                System.out.println("yes true a = 5  and b is not true");
            }
        }
        else {
            System.out.println("sorry a is wrong");
        }
    }
}
