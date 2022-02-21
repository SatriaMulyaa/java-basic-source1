package com.tutorial;
import java.util.Arrays;
public class Training {
    public static void main(String[] args) {
        int angka[] = {1,2,3,4,5};
        // first
        System.out.println("===this use library Arrays===");
        System.out.println(Arrays.toString(angka));
        // second
        System.out.println("===this use looping standard===");
        for (int i = 0; i <5 ; i++) {
            System.out.println(angka[i]);
        }
        System.out.println("===this use arraylength===");
        // third
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }
        System.out.println("===looping with foreach===");
        for(int angkas : angka){
            System.out.println(angkas);
        }
    }
}
