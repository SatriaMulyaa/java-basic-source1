package com.tutorial;
import java.util.Arrays;
public class Training {
    public static void main(String[] args) {
        System.out.println("===MENGUBAH ARRAY MENJADI STRING===");
        int[] array1 = {1,2,3,4,5};
        print(array1);
        System.out.println(array1);
        System.out.println("===COPY ARRAY DENGAN LOOPING===");
        int[] array2 = new int[5];
        for (int i = 0; i < array2.length ; i++) {
            array2[i] = array1[i];
        }
        print(array2);
        System.out.println(array2);
        System.out.println("Mengcopy array dengan COPY OF");
        int[]array3 = Arrays.copyOf(array2,5);
        print(array3);
        System.out.println("Mengcopy array dengan COPY OF RANGE");
        int[]array4 = Arrays.copyOfRange(array1,0,5);
        print(array4);
        System.out.println("Mengfill array dengan 1 value");
        int[]array5 = new int[5];
        print(array5);
        Arrays.fill(array5,10);
        print(array5);
        System.out.println("Komparasi Array");
        System.out.println(Arrays.equals(array1,array2));
        if(Arrays.equals(array1,array2)){
            System.out.println("sama");
        }else{
            System.out.println("array 1 dengan array 2 berbeda");
        }
        System.out.println();
        System.out.println("CEK ARRAY MANA YANG LEBIH BESAR");
        int[] array6 = {1,2,3,4,5,};
        int[] array7 = {1,9,3,4,5,};
        System.out.println(Arrays.compare(array6,array7));
        System.out.println("CEK INDEX MANA YANG BERBEDA");
        System.out.println(Arrays.mismatch(array6,array7));
        System.out.println("Sorting Array");
        int[] array8 = {5,6,4,1,2,3};
        Arrays.sort(array8);
        print(array8);
        System.out.println("SEARCH ARRAY");
        int value = 1;
        int position = Arrays.binarySearch(array8,value);
        System.out.println("value " + value + " in index " + position);
    }
    static void print(int[] array){
        System.out.println(Arrays.toString(array));
    }
}
