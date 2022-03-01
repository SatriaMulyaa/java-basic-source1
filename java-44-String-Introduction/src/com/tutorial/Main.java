package com.tutorial;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // make String
        String kataString = "hallo";
        char[] kataChar = {'h','a','l','l','o'};

        // show String
        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));

        // access component String
        System.out.println("komponen pertama dari char[] = " + kataChar[0]);
        System.out.println("komponen pertama dari String = " + kataString.charAt(0));



        // change components
        kataChar[0] = 'c';
        System.out.println(Arrays.toString(kataChar));

        //kataString[0] = "c"; <------------ cannot
        // kataString.charAt[0] = "c"; <-------- cannot

        printAddress("kataString",kataString);
        // we can change component indirectly
        kataString = "c" + kataString.substring(1,5);
        System.out.println(kataString);

        printAddress("kataString",kataString);


        // memory from String (String pool)


        String str_1 = "hallo";
        String str_2 = "test";
        String str_3 = "testing";


        printAddress("str_1",str_1);
        printAddress("str_2",str_2);
        printAddress("str_3",str_3);

        str_3 = str_3.substring(0,4);
        printAddress("str_3", str_3);

        String str_4 = "callo";
        printAddress("str_4",str_4);

        kataString = "callo";
        printAddress("kataString",kataString);

        // lebih dalam
      String a = new String("hallo");
        printAddress("a",a);

    }

    private static void printAddress(String name, String data){
        int address = System.identityHashCode(data);
        System.out.println(name + " = " + data + "\t|| address = " + Integer.toHexString(address));
    }
}
