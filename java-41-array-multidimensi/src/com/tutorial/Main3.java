package com.tutorial;
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        // Sistem untuk mengetahui jumlah mahasiswa yang masuk berdasarkan jurusan dan tahun
        // kita buat arraynya dulu yang terdiri dari jurusan dan tahun
        // kita memiliki array 3x4
        int[][] jumlah = {{50, 29, 45, 43}, {70, 29, 25, 43, 37}};
        ;

        // jurusan teknik informatika  dan sistem informasi beserta jumlahnya
//        jumlah[0][0] = 50;
//        jumlah[0][1] = 29;
//        jumlah[0][2] = 25;
//        jumlah[0][3] = 43;
//        jumlah[0][4] = 37;
//        jumlah[1][0] = 70;
//        jumlah[1][1] = 29;
//        jumlah[1][2] = 25;
//        jumlah[1][3] = 43;
//        jumlah[1][4] = 37;

        Scanner userInput = new Scanner(System.in);

        int jurusan,tahun;
        do {
            System.out.print("tekan 0 untuk jurusan teknik informatika dan\ntekan 1 untuk jurusan sistem informasi :");
            jurusan = userInput.nextInt();
        } while ((jurusan != 0) && (jurusan != 1));

        do {
            System.out.print("Silahkan input tahun 2001,2002,2003,2004 : ");
            tahun = userInput.nextInt();
        } while ((tahun < 2001) || (tahun > 2004));
        int totalTahun = tahun -2001;

        System.out.println(jumlah[jurusan][totalTahun]);

    }
}
