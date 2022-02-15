package com.tutorial;
public class Training {
    public static void main(String[] args) {
        int a = 0;
        while(true){
            a++;
            if(a == 5){
                continue;
            }else if(a == 7){
                return;
            }
            System.out.println("a = " + a);
        }
    }
}
