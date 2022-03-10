package com.tutorial;

public class Main  {
    public static void main(String[] args) {
        String name = "Udin";
        int age = 17;

        // normal way
        System.out.println("nama saya adalah " + name + " , " + "umur saya adalah " + age);

        // by way of format String
        System.out.printf("nama saya adalah %s umur %s adalah %d\n",name,name,age);

        // conversion : f=floating point, d=integer, c=character, s=string, b=boolean

        // struktur format = %[argument_index$][flags][width][.precious]conversion

        //[argument_index$]
        System.out.println("\n[argument_index$]");

        // udin , O.. udin, where have you been udin ?
        System.out.printf("%1$s wahai %1$s, kemana saja kamu %1$s?\n",name);
        // umur udin berapa?, udin menjawab: 17, wah masih  muda ya  umurnya 17
        System.out.printf("\numur %1$s berapa?, \n%1$s menjawab: %2$d, \nwah masih muda ya, umurnya %2$d\n",name,age);

        // flags
        System.out.println("\n[flags]");
        int int1 = 5;
        int int2 = 8;
        int hasil = int1 - int2;
        System.out.printf("%d - %d = %+d",int1,int2,hasil);

        //width
        System.out.println("\n[width]");
        int int3 = 1000;
        int int4 = 1000000;
        int int5 = 1000000000;
        System.out.println("INTEGER");
        System.out.printf("%d\n",int3);
        System.out.printf("%5d\n",int3);
        System.out.printf("%+5d\n",int3); // flags akan mengambil slot di dalam format
        System.out.printf("%-5d\n",int3); // flags = "-", artinya rata kiri
        System.out.printf("%+-6d\n",int3); // flags bisa digabungkan
        System.out.printf("%010d\n",int3); // flags = "0", kita tambahkan leading "0" di deoannya
        System.out.printf("%+010d\n",int3);
        System.out.printf("%,10d\n",int4); //flags = ",", menandakan deliemeter per seribu
        System.out.printf("%-,15d\n",int5);

        System.out.println("\nFLOATING POINT");
          float float1 = 1.534f;
        System.out.printf("%f\n",float1);
        System.out.printf("%5f\n",float1);
        System.out.printf("%9f\n",float1);
        System.out.printf("%+9f",float1); // bahwa floating point angka mengambil width 6 decimal


        // [precision]
        System.out.println("\n[precision]");
        float float2 = 15.678f;
        System.out.printf("%.1f\n",float2);
        System.out.printf("%.2f\n",float2);
        System.out.printf("%8.2f\n",float2); // gabungan dengan width
        System.out.printf("%08.2f\n",float2); // gabungan dengan width and flag

        //contoh
        String nama = "udin";
        float ipk = 3.7852971927f;
        System.out.printf("ipk %1$s berapa?\nipk %1$s : %2$+5.2f\n",nama,ipk);

        // save format ini kedalam variable string
        String info_biasa = "nama: " + nama + ", IPK = " + ipk;
        System.out.println(info_biasa);

        String info_format = String.format("nama = %s, IPK = %2$+5.2f",nama,ipk);
        System.out.println(info_format);
    }
}
