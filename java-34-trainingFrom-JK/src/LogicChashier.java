import java.util.*;

public class LogicChashier {
    public static void main(String[] args) {
        // declare
        int hargaRoti = 5000;
        int hargaSusu = 4000;
        int hargaShampoo = 500;
        int hargaTotalRoti;
        int hargaTotalSusu;
        int hargaTotalShampoo;
        int totalBelanja;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Item Tersedia");
        System.out.println("===================");
        System.out.println("Roti = " + hargaRoti + " / pcs");
        System.out.println("Susu = " + hargaSusu + " /pcs");
        System.out.println("Shampoo = " + hargaShampoo + " /pcs");
        System.out.println("===================");
        System.out.print("Masukkan jml roti : ");
        int inputRoti = userInput.nextInt();
        System.out.print("Masukkan jml susu : ");
        int inputSusu = userInput.nextInt();
        System.out.print("Masukkan jml shampoo : ");
        int inputShampoo = userInput.nextInt();
        System.out.println("===================");
        hargaTotalRoti = hargaRoti*inputRoti;
        hargaTotalSusu = hargaSusu*inputSusu;
        hargaTotalShampoo = hargaShampoo*inputShampoo;
        System.out.println("Harga Total Roti : " + hargaTotalRoti );
        System.out.println("Harga Total Susu : " + hargaTotalSusu);
        System.out.println("Harga Total Shampoo : " + hargaTotalShampoo);
        System.out.println("===================");
        totalBelanja = hargaTotalRoti + hargaTotalSusu + hargaTotalShampoo;
        System.out.print("Total Belanja : " + totalBelanja);
    }
}
