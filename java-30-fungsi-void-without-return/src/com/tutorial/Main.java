package com.tutorial;

public class Main {
    public static void main(String[] args) {
        System.out.println(simple());

        goodMorning("bro");
        goodMorning("bray");
    }

    private static void goodMorning(String nama){
        System.out.println("good morning " + nama);
    }

    // function or method withoud return
    private static void fungsiVoid(String Input){
        System.out.println(Input);
    }

    // function or method with return (kembalian)
    // so with use for return (10.f)
    private static float simple (){
        return 10.121f;
    }



}
