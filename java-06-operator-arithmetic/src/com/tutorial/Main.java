package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // arithmetic operations
        int variable1 = 11;
        int variable2 = 5;

        int hasil;

        // 1. addition
        hasil = variable1 + variable2;
        System.out.println(variable1 + " + " + variable2 + " = " + hasil);

        // 2. subtraction
        hasil = variable1 - variable2;
        System.out.printf("%d - %d = %d \n",variable1,variable2,hasil);

        // 3. division
        hasil = variable1 / variable2;
        System.out.printf("%d / %d = %d \n",variable1,variable2,hasil);
        float a = 6;
        float b = 4;
        float hasilFloat;
        hasilFloat = a / b;
        System.out.println(a + " / " + b + " = " + hasilFloat);

        // 4. multiplication
        hasil = variable1 * variable2;
        System.out.printf("%d x %d = %d \n",variable1,variable2,hasil);

        // 5. modulus (remainder of division)
        hasil = variable1 % variable2;
        System.out.printf("%d %% %d = %d \n",variable1,variable2,hasil);

    }
}
