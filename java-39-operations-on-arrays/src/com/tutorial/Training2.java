package com.tutorial;
import java.util.Arrays;
public class Training2 {
    public static void main(String[] args) {
        int[]array1 = {1,2,3,4,5};

        System.out.println("===Change array to String===");
        System.out.println(Arrays.toString(array1));

        System.out.println("===copy array to array with loop===");
        int[]array2 = new int[5];
        for (int i = 0; i < array1.length ; i++) {
            array2[i] = array1[i];
        }
        System.out.println(Arrays.toString(array2));
        System.out.println("proof memory array 1 and array 2 different");
        System.out.println(array1);
        System.out.println(array2);

        System.out.println("===copy with copy of===");
        int[]array3 = Arrays.copyOf(array1,5);
        System.out.println(Arrays.toString(array3));
        System.out.println(array3);

        System.out.println("===copy with copy of range===");
        int[]array4 = Arrays.copyOfRange(array1, 0, 5);
        System.out.println(Arrays.toString(array4));


        System.out.println("fill array with one value");
        int[]array5 = new int[5];
        Arrays.fill(array5, 1);
        System.out.println(Arrays.toString(array5));

        System.out.println("COMPARE ARRAY WITH EQUALS");
        int[]array6 = {1,2,3,4,5};
        int[]array7 = {1,3,3,4,5};
        System.out.println(Arrays.equals(array6,array7));

        System.out.println("COMPARE ARRAY WITH compare");
        System.out.println(Arrays.compare(array6,array7));

        System.out.println("check array bigger?");
        System.out.println(Arrays.mismatch(array6,array7));

        System.out.println("sorting");
        int[]array8 = {5,3,2,6,7,1,8,9,11,10};

        Arrays.sort(array8);
        System.out.println(Arrays.toString(array8));

        System.out.println(Arrays.binarySearch(array8, 3));

    }
}
