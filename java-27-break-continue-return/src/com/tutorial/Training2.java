package com.tutorial;

public class Training2 {
    public static void main(String[] args) {
        // break
//        int a = 0;
//        boolean kondisi = true;
//        while (kondisi){
//            a++;
//            System.out.println(a);
//            if(a == 3){
//                break;
//            }else if(a == 2){
//                return;
//            }
//            System.out.println("tes" + a);
//        }
//        System.out.println("selesai");
        tes();
    }

    static void tes(){
        int a = 0;
        boolean kondisi = true;
        while (kondisi){
            a++;
            System.out.println("print ke "+ a);
            if(a==5){
                return;
            }
        }
        System.out.println("selesai");
    }
}
