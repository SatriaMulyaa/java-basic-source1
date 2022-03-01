package com.tutorial;

public class Trainingzx {
    public static void main(String[] args) {
//        int j = 0;
//        for (int i = 0; i <= 10 ; i++) {
//            System.out.println("fibonaci ke -"+i + " = " + branchRecursiveFibonacci(j));
//            j++;
//        }

        System.out.println("fibonacci ke 4 "  + " = " + fibonacci(4, "atas") );


    }

    private static int branchRecursiveFibonacci(int n){
        if(n == 0 | n == 1 ){
            return n;
        }else{
            return branchRecursiveFibonacci(n-1) + branchRecursiveFibonacci(n-2);
        }
    }

    private static int fibonacci(int n, String daun){
        System.out.println(daun);
        System.out.println(n);
        if(n == 0 | n == 1 ){
            return n;
        }else{
            return fibonacci(n-1, "kiri") + fibonacci(n-2,"kanan");
        }
    }


}
