package com.tutorial;
import java.util.Arrays;
public class Training2 {
    public static void main(String[] args) {
        System.out.println("view array with class Arrays");
        int[]value = {1,2,3,4,5};
        System.out.println(Arrays.toString(value));
        System.out.println("view array standard loop");
        int[]value1 = {5,6,7,8,9};
        for (int i = 0; i <5 ; i++) {
            System.out.println("array index ke- " + i + " " + " = " + value1[i]);
        }
        System.out.println("view array loop auto with length");
        int[]value2 = {1,2,3,4,5};
        for (int i = 0; i <value2.length ; i++) {
            System.out.println("array index ke- " + i + " " + " = " + value2[i]);
        }
        System.out.println("view array foreach");
        String[]names = {"Mane", "Firminho", "Salah"};
        System.out.println("liverpool forward : ");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
