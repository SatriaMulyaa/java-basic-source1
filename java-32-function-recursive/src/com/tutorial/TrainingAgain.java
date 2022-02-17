package com.tutorial;

public class TrainingAgain {
    public static void main(String[] args) {
        System.out.println( factorial(5));
    }
    // 5*4*3*2*1
    static int factorial(int value){
        if(value <= 1){
            return value ;
        }else{
            return value * factorial(value-1);
        }
    }
}
