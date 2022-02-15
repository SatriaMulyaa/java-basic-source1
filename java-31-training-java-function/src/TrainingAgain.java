import java.util.Scanner;
public class TrainingAgain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("addValue for breadths of rectangle : ");
        int breadths = userInput.nextInt();
        System.out.print("addValue for  length of rectangle : ");
        int length = userInput.nextInt();
        /*
         *****
         *****
         *****
         */
        InputSquare(length, breadths);
        System.out.println("perimeterOfRectangle : " + PerimeterOfRectangle(length,breadths));
        System.out.println("areaOfRectangle : " + AreaOfRectangle(length,breadths));

    }
    private static void InputSquare(int length, int width){
        for (int i = 1; i <=width ; i++) {
            for (int j = 1; j <=length ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    private  static int AreaOfRectangle(int l, int b){
        int length,breadths,area;
        length = l;
        breadths= b;
        area = length*breadths;
        return area;
    }


    private static int PerimeterOfRectangle(int l, int b){
        int length,breadths,perimeter;
        length = l;
        breadths= b;
        perimeter = 2*(length+breadths);
        return perimeter;
    }
}
