package com.tutorial;
import java.util.Arrays;
public class training {
    public static void main(String[] args) {
        String[] name = {"Satria", "Mulya"};
        System.out.println(name);

        int[]angka = new int[5];
        angka[0] = 1;
        angka[1] = 2;
        angka[2] = 3;
        angka[3] = 4;
        angka[4] = 5;
        System.out.println(angka[0]);
        System.out.println(angka[1]);
        System.out.println(angka[2]);
        System.out.println(angka[3]);
        System.out.println(angka[4]);
        System.out.print(Arrays.toString(angka));

    }
}
