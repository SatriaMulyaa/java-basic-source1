package com.tutorial;

public class Main {
    public static void main(String[] args) {

//        do {
//            aksi
//        }while(kondisi)
        System.out.println("this is beginning of program");
        boolean condition = true;
        int a = 0;
        do{
            a++;
            System.out.println("do while to- " + a);
            if(a == 10){
                condition = false;
            }
        }while(condition);

        System.out.println("this is the end of program");
    }
}
