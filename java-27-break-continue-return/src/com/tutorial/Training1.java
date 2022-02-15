package com.tutorial;

public class Training1 {
    public static void main(String[] args) {
        // break
        int a = 0;
        boolean kondisi = true;
        while (kondisi){
            a++;
            System.out.println(a);
            if(a == 5){
                kondisi = false;
            }else if(a == 3){
                continue;
            }
            System.out.println("tes" + a);
        }
        System.out.println("selesai");
    }
}
