package com.tutorial;

public class Trainingzz {
    public static void main(String[] args) {
        // if else
        int a = 5;
        if(a == 5){
            System.out.println("your genius");
        }else{
            System.out.println("hmm you have a lot learn ");
        }

        // if else if
        int b = 10;
        if(b == 5){
            System.out.println("hmm maybe");
        }else if(b == 10){
            System.out.println("hmm you right ");
        }else{
            System.out.println("wow you are so ugly");
        }


        // if nested
        int c = 50;
        if(c == 50){
            if(b==20){
                System.out.println("yea c and b right");
            }else{
                System.out.println("no c right and b wrong");
            }
        } else{
            System.out.println("no you wrong");
        }


        // training
        int e = 20;
        int f = 50;
        if(e == 10){
            System.out.println("yes e is right");
        }else if(f == 20){
            System.out.println("yes b is right");
        }else{
            if(c == 10){
                System.out.println("yes you right");
            }else{
                System.out.println("no you wrong ");
            }
        }
    }
}
