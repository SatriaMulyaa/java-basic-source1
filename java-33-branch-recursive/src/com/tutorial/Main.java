package com.tutorial;
import java.util.Scanner;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
//        System.out.println("test");
        Scanner userInput = new Scanner(System.in);
        System.out.print("masukkan nilai n : ");
        int nilai = userInput.nextInt();
        int nilai_fibonacci = fibonacci(nilai, "atas");
        System.out.println("nilai fibonacci ke-"+ nilai+ " adalah " + nilai_fibonacci);
    }
    private static int fibonacci(int n, String daun){
        System.out.println("daun " + daun);
        System.out.println("fibonacci ke- " + n);
        if(n == 1 || n == 0){
            return n;
        }
        return fibonacci(n-1, "ke kiri") + fibonacci(n-2, "ke kanan");
    }
}
