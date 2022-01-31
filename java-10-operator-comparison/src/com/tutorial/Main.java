package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // operator equal atau persamaan
        System.out.println("====EQUAL====");
        // example 1
        int a,b;
        a = 10;
        b = 10;
        System.out.printf("%d is it the same as %d ? %s\n",a,b,(a==b));

        // example 2
        int c,d;
        c = 11;
        d = 10;
        System.out.printf("%d is it the same as %d ? %s\n",c,d,(c==d));

        // example 3
        int e,f;
        boolean resultComparison;

        e = 11;
        f = 10;

        resultComparison = (e == f);
        System.out.printf("%d is it the same as %d ? %s\n",e,f,resultComparison);

        // example 4 comparison with data type float
        float g,h;
        boolean resultComparison2;

        g = 11.0f;
        h = 10.0f;

        resultComparison2 = (g == h);
        System.out.printf("%f == %f --> %s\n",g,h,resultComparison2);

        // operator not equal atau pertidaksamaan
        System.out.println("===NOT EQUAL===");
        int j = 10;
        int k = 11;

        boolean resultComparison3 = (j != k);
        System.out.printf("%d != %d --> %s\n",j,k,resultComparison3);

        j = 10;
        k = 10;
        resultComparison3 = (j != k);
        System.out.printf("%d != %d --> %s\n",j,k,resultComparison3);


        // operator less or kurang dari
        System.out.println("===LESS THAN===");
        j = 12;
        k = 9;

        resultComparison3 = (j < k);
        System.out.printf("%d < %d --> %s\n",j,k,resultComparison3);

        // operator greater than or lebih dari
        System.out.println("===GREATER THAN===");

        j = 8;
        k = 4;
        resultComparison3 = (j > k);
        System.out.printf("%d > %d --> %s\n",j,k,resultComparison3);

        // operator less than equals atau kurang dari sama dengan
        System.out.println("===LESS THAN EQUALS===");

        j = 8;
        k = 10;
        resultComparison3 = (j <= k);
        System.out.printf("%d <= %d --> %s\n",j,k,resultComparison3);

        // operator greater than equals atau lebih dari sama dengan
        System.out.println("===GREATER THAN EQUALS===");

        j = 10;
        k = 10;
        resultComparison3 = (j >= k);
        System.out.printf("%d >= %d --> %s\n",j,k,resultComparison3);

    }
}
