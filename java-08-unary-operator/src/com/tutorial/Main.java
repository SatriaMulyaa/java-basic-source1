package com.tutorial;

public class    Main {
    public static void main(String[] args) {

        // unary + and -
        int number = 1;
        System.out.printf("unary '-', %d become %d\n",number, -number);
        System.out.printf("unary '+', %d become %d\n",number, +number);

        // unary increment and decrement
        int numbers1 = 10;
        numbers1++;
        numbers1++;
        System.out.printf("unary '++', %d become %d\n",numbers1, -numbers1);

        int numbers2 = 10;
        numbers2--;
        System.out.printf("unary '--', %d become %d\n",numbers2, -numbers2);

        // post increment
        int b = 5;
        System.out.printf("value with '--' a prefix increment become = %d\n", b++);
        System.out.printf("result value of prefix increment is = %d\n", b);
        // prefix increment
        int a = 5;
        System.out.printf("value with '++' a post increment become = %d\n", ++a);

        // unary boolean with ! for negation
        boolean ucup = true;
        System.out.println("boolean value = " + ucup);
        System.out.println("boolean value = " + !ucup);

    }
}
