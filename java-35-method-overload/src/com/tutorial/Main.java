package com.tutorial;

public class Main {
    public static void main(String[] args) {
        printValue(10);
        printValue(10.5F);
        printValue(10.5d);

        int resultInteger;
        resultInteger = addition(10,20);
        printValue(resultInteger);

        float resultFloat;
        resultFloat = addition(10.5f,20);
        printValue(resultFloat);

        resultFloat = addition(20,20.5f);
        printValue(resultFloat);

        resultInteger = addition(10,20,10);
        printValue(resultInteger);

    }

    private static float addition(int value2,float valueFloat){
        return value2 + valueFloat ;

    }private static float addition(float valueFloat, int value2){
        return valueFloat + value2;
    }

    private static int addition(int value1, int value2){
        return value1 + value2;
    }

    private static int addition(int value1, int value2, int value3){
        return value1 + value2 + value3;
    }

    private  static void printValue(int valueInteger){
        System.out.println("this is Integer value with value =  " + valueInteger);
    }

    private  static void printValue(float valueFloat){
        System.out.println("this is Float value with value =  " + valueFloat);
    }

    private  static void printValue(double valueDouble){
        System.out.println("this is Double value with value =  " + valueDouble);
    }
}
