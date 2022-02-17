import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("input batas deret fobonacci : ");
        int input = userInput.nextInt();
        fibonaccis(input);
    }

//    fn -> 0  1  2  3  4  5  6  7   8   9   10
//    value 0  1  1  2  3  5  8  13  21  34  55
//
//fn = fn_1 + fn_2
//f2 = f2_1 + f2_2
//f2 = f1 + f0
//f2 = 1 + 0
//f2 = 1

    /*
    f3
    fn_2 = fn_1
    fn_1 = fn
    fn_2 = 1
    fn_1 = 1
    f3 = 1 + 1 = 2
     */

    static void fibonaccis(int input){
        int fn = 4;
        int fn_1 = 4;
        int fn_2 = 2;
        for (int i = 1; i <=input ; i++) {
            System.out.print(fn + " , ");
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
        }
    }
}
