package com.tutorial;

public class Training3 {
    public static void main(String[] args) {
        System.out.println("===BREAK-AND-CONDITION TRUE===");
        int n = 1;
        boolean condition = true;
        while (condition) {
            if (n < 6) {
                System.out.println("print- " + n);
            } else if (n == 6) {
               condition = false;
            }
            System.out.println("n2" + n);
            n++;
        }
        System.out.println("\n===EVEN NUMBER CONTINUE===");
        evenNumber(10);
        System.out.println("\n===EVEN NUMBER RETURN===");
        evenReturn(10);
    }

    static void evenNumber(int n){
        for (int i = 2; i < n ; i++) {
            if(i % 2 == 1){
                continue;
            }else{
                System.out.println("value - " + i);
            }
        }
    }
    static void evenReturn(int n){
        for (int i = 2; i < n ; i++) {
            if(i % 2 == 1){
                return;
            }else{
                System.out.println("value - " + i);
            }
        }
    }


}
