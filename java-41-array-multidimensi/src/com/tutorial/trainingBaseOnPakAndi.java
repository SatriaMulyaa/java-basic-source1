package com.tutorial;
import java.util.Scanner;

public class trainingBaseOnPakAndi {
    public static void main(String[] args) {
        // make array 2 dimension
        // study case : see total student university base on major
        // making array [major][year]
        // year from 2001 - 2004
        // major = informatics technique , system information
        int[][]students  = new int[2][4];
        students[0][0] = 10;
        students[0][1] = 80;
        students[0][2] = 90;
        students[0][3] = 100;
        students[1][0] = 500;
        students[1][1] = 1000;
        students[1][2] = 10200;
        students[1][3] = 500000;

        // call class Scanner
        Scanner userInput = new Scanner(System.in);
        // we give loop for choose major
        int major;
        do{
            System.out.print("enter major (0 for IT, 1 for SI) : ");
            major = userInput.nextInt();
        }while(major != 0 && major != 1);

        // we give loop for choose year
        int year;
        do{
            System.out.print("enter year 2001-2004 : ");
            year = userInput.nextInt();
        }while(year == 2001 && year == 2002 && year == 2003 && year == 2004);
        year-=2001;

        System.out.println("total students for major base on year selected : "+ students[major][year]);
    }
}
