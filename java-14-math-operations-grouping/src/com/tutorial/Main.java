package com.tutorial;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int result = 2 * 5 + 10;
        System.out.println(result);

        // conclusion is
        // multiplication or division will be done first
        // So multiplication and division are proportional
        // if you do multiplication and division,
        // the operation will be carried out from left to right
        int result2 = 10 / 2 + 2 * 5;
        System.out.println(result2);

        int result3 = 10 / 2  * 5;
        System.out.println(result3);

        int result4 = 5 * 10 / 2;
        System.out.println(result4);

        int result5 = 5 + 2 - 10;
        System.out.println(result5);

        // use group operation with ()
        int result6 = 5 * (2 + 10);
        System.out.println(result6);

        // persamaan kuadrat
        System.out.println("Persamaan Kudrat");
        // declare
        int m,x,c,result1;
        Scanner userInput = new Scanner(System.in);
        // initialize input user
        System.out.print("Input user x = " );
        x = userInput.nextInt();
        System.out.print("Input user m = " );
        m = userInput.nextInt();
        System.out.print("Input user c = " );
        c = userInput.nextInt();
        // formula
        result1 = (m*x*x) + c;
        System.out.println("result = " + result1);


    }
}
