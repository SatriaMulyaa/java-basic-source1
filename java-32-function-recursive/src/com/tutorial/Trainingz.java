package com.tutorial;

public class Trainingz {
    public static void main(String[] args) {
        System.out.println("recursive");
        recursive(3);
        System.out.println("factorial");
        System.out.println( factorial(5));
        recursif(5);
    }

    private static int recursive(int x){
        System.out.println(x);
        if(x==1){
            return x;
        }
        x--;
        return  recursive(x);
    }

    private static void recursif(int x){
        System.out.println(x);
        x--;
        if(x == 1){
            return ;
        }
        recursif(x);
    }

    private static int factorial(int x){
        System.out.println(x);
        if(x== 1){
           return x;
        }else{
            return  x * factorial(x-1);
        }
    }
}
