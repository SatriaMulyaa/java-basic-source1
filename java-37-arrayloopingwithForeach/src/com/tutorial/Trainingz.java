package com.tutorial;

public class Trainingz {
    public static void main(String[] args) {
        int[]values = {1,2,3,4,5};
        for(int value : values){
            if(value < 5){
                System.out.print(value + ",");
            }else{
                System.out.print(value);
            }
        }
    }
}
