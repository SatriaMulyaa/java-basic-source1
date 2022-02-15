package com.tutorial;

public class Training {
    public static void main(String[] args) {
        printValue(5);
        System.out.println(printAmount(5));
    }

    private static void printValue(int parameter){
        System.out.println("print"+parameter);
        if(parameter == 0){
            return;
        }
        parameter--;
        printValue(parameter);
    }

    private static int printAmount(int parameter){
        if(parameter == 1){
            return parameter;
        }
       return parameter * printAmount(parameter -1);
    }
}
