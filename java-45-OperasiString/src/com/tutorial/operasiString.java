package com.tutorial;
import java.util.Scanner;
import java.lang.String;


public class operasiString {
    public static void main(String[] args) {
        // take component from string
        String kalimat = "Saya suka makan pisang";
        System.out.println(kalimat.charAt(5));

        // substring
        String kata = kalimat.substring(10,15);
        System.out.println(kata);

        // concatenation(congcat)
        String kalimat2 = kata + " bakwan";
        System.out.println(kalimat2);

        kata  = kata + " cireng";
        System.out.println(kata);

        // concat with non String
        int jumlah = 20;
        String kalimat3 = kata + " " + jumlah;
        System.out.println(kalimat3);
        System.out.println(kata + " " + jumlah);

        // lowercase and uppercase
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());

        // replace
        String kalimat4 = kalimat.replace("pisang","combro");
        System.out.println(kalimat4);

        // compare
        String motor1 = "royal enfield himalayan";
        String motor2 = "kawasaki w175";
        System.out.println(motor1.compareTo(motor2));
        System.out.println(motor2.compareTo(motor1));

        String gorengan1 = "bakwan";
        String gorengan2 = "bala-bala";
        System.out.println(gorengan1.compareTo(gorengan2));
        System.out.println(gorengan2.compareTo(gorengan1));

        //equality
//        String kataInput = "test"; // its in string pool
        String kataInput = new String("test"); // this is not string literal , and not at String pool
        String kataTest = "test"; // its in string pool

        System.out.println("\nPersamaan pada lokasi string pool");
        if(kataInput == kataTest){
            System.out.println("sama");
        }else{
            System.out.println("tidak sama");
        }

        Scanner userInput = new Scanner(System.in);
        System.out.print("Mengambil input dari String user : ");
        kataInput = userInput.next();
        System.out.println("ini adalah input user : " + kataInput);
        if(kataInput.equals(kataTest)){
            System.out.println("sama");
        }else{
            System.out.println("tidak sama");
        }
    }

    private static void print(String nama, String data){
        int address = System.identityHashCode(data);
        System.out.println(nama  + " = " + data + " || " + Integer.toHexString(address) );
    }
}
