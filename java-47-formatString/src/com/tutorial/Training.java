package com.tutorial;

import java.util.Formatter;

public class Training {
    public static void main(String[] args) {
        String name = "yanto";
        int age = 17;

        // normal way
        System.out.println("hello my name is " +  name + " i'm " + age + " years old ");
        // String format way
        System.out.printf("hello this is %s and %s age is  %d years old",name,name,age);

        // structure format : [argument_index$] [flags] [width] [.precision] conversion
        System.out.println("[argument_index$]");
        System.out.printf("%1$s how old are you %1$s?\nI'm %2$d years old said %1$s",name,age);

        System.out.println("[flags]");
        int value1 = 5;
        int value2 = 8;
        int hasil  = value1 + value2;
        System.out.printf("%d + %d = %+d",value1,value2,hasil);

        System.out.println("[width]");
        int x = 1000;
        System.out.printf("%d\n",x);
        System.out.printf("%5d\n",x);
        System.out.printf("%-5d\n",x);
        System.out.printf("%-10d\n",x);
        System.out.printf("%+5d\n",x);
        System.out.printf("%+6d\n",x);
        System.out.printf("%+-6d\n",x);
        System.out.printf("%010d\n",x);
        System.out.printf("%+010d\n",x);
        System.out.printf("%,10d\n",x);
        int z = 1000000000;
        System.out.printf("%-,15d\n",z);
        System.out.println("floating point");
        float float1 = 1.543f;
        System.out.printf("%f\n",float1);
        System.out.printf("%+9f\n",float1);

        System.out.println("[precision]");
        float float2 = 18.678f;
        System.out.printf("%f\n",float2);
        System.out.printf("%.1f\n",float2);
        System.out.printf("%.2f\n",float2);
        System.out.printf("%08.2f\n",float2); //digabungkan dengan width
        System.out.printf("%+08.2f\n",float2); //digabungkan dengan width and flag


        System.out.println("contoh akhir");
        /*
        [argument_index$], [flags], [width], [.precision] conversion
         */
        String name2 = "Ucup";
        float IPK =   3.78568438473f;
        System.out.printf("IPK %1$s berapa\n%1$s: saya dapat %2$+5.2f",name2,IPK);

        System.out.println("string biasa");
        String stringBiasa = "nama : " + name2 + " IPK : " + IPK;
        System.out.println(stringBiasa);

        System.out.println("string format");
        String stringFormat = String.format("name : %s, IPK : %2$+5.2f: ",name2,IPK);
        System.out.println(stringFormat);

        System.out.println("string builder format");
        StringBuilder builderInfo = new StringBuilder();
        Formatter formatBuilder = new Formatter(builderInfo);


        formatBuilder.format("name : %s, IPK : %2$+5.2f:",name2,IPK);
        System.out.println("String builder format --> " + builderInfo);

    }
}
