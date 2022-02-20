package com.tutorial;
import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[]array1 = {1,2,3,4,5};
        // change array to String
        System.out.println("Merubah array menjadi String\n=============================");
        print(array1);

        // copy array to array
        System.out.println("\ncopy array\n=============================");
        int[] array2 = new int[5];
        print(array1);
        print(array2);
        System.out.println("\ncopy array with loop");
        for (int i = 0; i <array1.length ; i++) {
            array2[i] = array1[i];
        }
        print(array1);
        System.out.println(array1);
        print(array2);
        System.out.println(array2);

        System.out.println("\nMengcopy array dengan copyOf\n=============================");
        int [] array3 = Arrays.copyOf(array1,5);
        print(array1);
        System.out.println(array1);
        print(array3);
        System.out.println(array3);

        System.out.println("\nMengcopy array dengan copyOfRange\n=============================");
        int [] array4 = Arrays.copyOfRange(array1,2,6);
        print(array1);
        System.out.println(array1);
        print(array4);
        System.out.println(array4);

        System.out.println("\nfill array\n=============================");
        int[] array5 = new int[10];
        print(array5);
        Arrays.fill(array5,1);
        print(array5);

        System.out.println("\ncompare array\n=============================");
        int[] array6 = {1,2,3,4,5};
        int[] array7 = {1,2,3,4,5};

        System.out.println("===compare 2 arrays===");
        System.out.println(Arrays.equals(array6,array7));

        if(Arrays.equals(array6,array7)){
            System.out.println("this array is same ");
        } else{
            System.out.println("this array is not same");
        }

        System.out.println("\n===check where is the bigger array===");
        System.out.println(Arrays.compare(array6,array7));

        System.out.println("\n===Check where is the different index===");
        System.out.println(Arrays.mismatch(array6,array7));

        System.out.println("====sort array===");
        int[] array8 = {1,6,4,5,3,5,2,6};
        print(array8);
        Arrays.sort(array8);
        print(array8);

        System.out.println("====search array===");
        int value = 3;
        int position= Arrays.binarySearch(array8,value);
        System.out.println("value " + value + " in index- " + position );
    }

    private static void print(int[] dataArray){
        System.out.println("array = "+ Arrays.toString(dataArray));
    }
}
