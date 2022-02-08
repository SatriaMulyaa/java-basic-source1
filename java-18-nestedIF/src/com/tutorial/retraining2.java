package com.tutorial;
import java.util.*;
public class retraining2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int a,b,c;

        System.out.print("fill value a : ");
        a = userInput.nextInt();
        System.out.print("fill value b : ");
        b = userInput.nextInt();
        System.out.print("fill value c : ");
        c = userInput.nextInt();

//       if(a == 5){
//           System.out.println("true a == 5");
//       } else {
//           if(b == 2){
//               System.out.println("true b == 2");
//           }else{
//            if(c == 3){
//                System.out.println("true c == 3");
//            }else{
//                System.out.println("false c == 3");
//            }
//           }
//       }

        if(a == 5){
            System.out.println("true a = 5");
        }else if(b == 2){
            System.out.println("true b = 2");
        }else{
            if(c == 10){
                System.out.println("true c = 10");
            }else{
                System.out.println("false c = 10");
            }
        }

    }
}
