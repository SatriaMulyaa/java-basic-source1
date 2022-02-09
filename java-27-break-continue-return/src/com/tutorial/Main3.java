package com.tutorial;

public class Main3 {
    public static void main(String[] args) {
        // break, continue, return
        int i  = 0;
        while(true){
            i++;
            if(i == 10){
                break;  // keyword to force exit from loop
            }else if(i == 5){
                continue; // keyword to force back action from beginning
            }
            System.out.println("looping to - " + i);
        }
        System.out.println("exit from looping");
    }
}
