package com.tutorial;

public class Main2 {
    public static void main(String[] args) {
        // break, continue, return
        int i  = 0;
        boolean condition = true;
        while(condition){
            if(i == 10){
                condition = false;
            }
            i++;
            System.out.println("looping to - " + i);
        }
        System.out.println("exit from looping");
    }
}
