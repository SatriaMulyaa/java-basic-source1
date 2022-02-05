package com.tutorial;

public class Main2 {
    public static void main(String[] args) {
        int a,b,c;
        a = 10;
        b = 5;
        c = 4;

        if(a == 1) {
            System.out.println("statement1");
        }else{
            if(b == 3){
                System.out.println("statement 4");
            }else{
                if(c == 2){
                    System.out.println("statement 2");
                }else{
                    System.out.println("statement 3");
                }
            }
        }
    }
}
