package com.tutorial;

import java.util.Arrays;

public class Training {
    public static void main(String[] args) {
        // declare and initialization String hello
        String hello = "hello";
        System.out.println(hello);
        address("hello",hello);

        // declare and initialization char o
        char o = 'o';
        System.out.println(o);
        // declare and initialization array char named hello1
        char[] hello1 = {'h','e','l','l','o'};
        System.out.println(Arrays.toString(hello1));

        // access value char hello1
        System.out.println("access value char hello1");
        System.out.println(hello1[0]);
        // access value String hello
        System.out.println("access value String hello");
        System.out.println(hello.charAt(0));

        // change component in array char
        hello1[0] = 'c';
        System.out.println(Arrays.toString(hello1));
        // indirect replacement
        hello = "c" + hello.substring(1,5);
        System.out.println(hello);
        address("hello",hello);


        // make new variable and initialize variable
        String cello = "hello";
        address(hello,cello);
        cello = "hello1";
        address(hello,cello);
        String zz = "hello";
        address("zz",zz);

        System.out.println("example again");
        String guys = "hello";
        address("guys",guys);
        String gyus = "hello guys";
        address("gyus",gyus);

        gyus = gyus.substring(0,5);
        address("gyus",gyus);

        String xx = gyus.substring(0,5);
        address("xx",xx);

        System.out.println(gyus);
        gyus = "j" + gyus;
        address("gyus",gyus);
        address("new xx",xx);



        System.out.println("new example");
        String one = new String("hello");
        address("one",one);
        System.out.println("\n");
        String two = new String("jeli");
        address("two",two);
        String three = "jeli";
        address("three",three);
        String four = "jeliwelingthon";
        address("four",four);
        String five = four.substring(0,4);
        address("five",five);


        System.out.println("kita coba");
        String a = new String("jeli");
        address("a",a);
        String b = "jeli";
        address("b",b);
        String c = four.substring(0,4);
        address("c",c);


        System.out.println("\nnew test");
        String e = "jerry";


        System.out.println("\n");
        System.out.println("example again");
        String az = "hilloGan";
        address("az", az);
        String j = "hillo";
        address("j", j);
        String g = new String("hillo");
        address("g", g);
        String bx = az.substring(0,5);
        address("bx", bx);
        String x = az.substring(0,5);
        address("x", x);

    }

    private static void address(String name, String data){
        int address =  System.identityHashCode(data);
        System.out.println(name + " = " + data + " || " + " " + "address" + " = " + Integer.toHexString(address));
    }
}
