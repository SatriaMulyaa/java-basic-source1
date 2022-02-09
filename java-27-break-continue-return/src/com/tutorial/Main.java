package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // break, continue, return
        int i  = 0;
        while(true){
            if(i == 10){
                break; // this is keyword to force exit from loop
            }
            i++;
            System.out.println("looping to - " + i);
        }
        System.out.println("exit from looping");
    }
}
