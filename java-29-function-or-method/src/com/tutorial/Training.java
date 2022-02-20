package com.tutorial;

public class Training {
    public static void main(String[] args) {
        int x,y;
        x = 20;
        y = hitung(x);
        System.out.println("x = " + x + "y = " + y);
        print(penjumlahan(10,20));

    }

    static void print(int n){
        System.out.println("hasil = " + n );
    }

    static int penjumlahan(int x, int y){
        int hasil = x + y;
        return hasil;
    }

    static int hitung(int x){
        x = (x + 2) * x;
        return x;
    }


}
