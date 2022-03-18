package comt.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] ArrayData = {0,1,2,3};

        Scanner userInput = new Scanner(System.in);
        System.out.print("data to-:");
        int indexInput = userInput.nextInt();

        // exception biasa
        System.out.println("Exception biasa");
        try{
            System.out.printf("array with index to-%d, is %d\n\n",indexInput,ArrayData[indexInput]);
        }catch(Exception e){
            System.err.println(e);
        }

        // exception didalam  fungsi
        System.out.println("\nException dalam fungsi");
        int data = ambilDataArray(ArrayData,indexInput);
        System.out.printf("array with index to-%d, is %d\n\n",indexInput,data);


        //Exception throws by method
        System.out.println("Exception throws by method");
        int data2 = 0;
        try{
            data2 = ambilData(ArrayData, indexInput);
        }catch(Exception e){
            System.err.println(e);
        }
        System.out.printf("array with index to-%d, is %d\n\n",indexInput,data2);

        System.out.println("\nakhir dari program");
    }

    private static int ambilData(int[] array, int index) throws Exception{
        int hasil = array[index];
        return hasil;
    }

    private static int ambilDataArray(int[] array, int index){
        int hasil = 0;
        try{
            hasil = array[index];
        }catch(Exception e){
            System.err.println(e);
        }
        return hasil;
    }
}
