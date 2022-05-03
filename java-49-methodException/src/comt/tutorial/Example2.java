package comt.tutorial;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[]array = {1,2,3,4,5};
        System.out.print("input index: ");
        int indexInput = userInput.nextInt();
        int data = (checkArray(array,indexInput));
        System.out.printf("data from index %d is %d\n",indexInput,data);
        try{
            int data2 = takeData(array,indexInput);
            System.out.printf("data from index2 %d is %d\n",indexInput,data2);
        }catch(Exception err){
            System.out.println(err.getMessage());
        }
    }

    private static int takeData(int[]array, int index)throws Exception{
        int result = array[index];
        return result;
    }

    private static int checkArray(int[]array, int index){
        int result = 0;
        try{
            result = array[index];
        }catch(Exception err){
            System.err.println(err);
        }
        return result;
    }
}
