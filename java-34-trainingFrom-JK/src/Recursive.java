import java.util.*;
public class Recursive {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("fill the factorial : ");
        int input = userInput.nextInt();
//        recursive(5);
        System.out.println("\n" +input  + " faktorial = " + factorial(input) );
    }

    static void recursive(int n){
        if(n > 0){
            System.out.println("this is recursive " + n);
            n--;
            recursive(n);
        }
    }

    static int factorial(int n){
        if(n <= 1){
            System.out.print( n );
            return n;
        }
        System.out.print(n + " x ");
        return n * factorial(n-1);
    }
}
