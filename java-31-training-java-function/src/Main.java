import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("input length : ");
        int inputLength = userInput.nextInt();
        System.out.print("input width : ");
        int inputWidth = userInput.nextInt();
        image(inputLength,inputWidth);


        System.out.println("wide = " + (wide(inputLength, inputWidth)));

        System.out.println("perimeter of rectangle " + (perimeterOfRectangle(inputLength, inputWidth)));

        showPerimeterAndWideRectangle(inputLength,inputWidth);

    }

    private static void showPerimeterAndWideRectangle(int length, int wide){
        System.out.println("wide " + wide(length,wide));
        System.out.println("perimeter " + perimeterOfRectangle(length,wide));
    }

    private static int wide(int length, int width){
        int result = length*width;
        return result ;
    }

    private static int perimeterOfRectangle(int length, int width){
        int result = (length+width) *2;
        System.out.println("calculate perimeter with length " + length + " and" + " width " + width);
        return result;
    }

    public static void image(int length, int width){
        for (int i = 0; i < width ; i++) {
            for (int j = 0; j < length ; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
