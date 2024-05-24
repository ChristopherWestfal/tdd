package org.example;

public class Fibonacci {

    static int x = 0;
    static int y = 1;


    public static String sumFib(int runs) {
        int temp;
        String counter = "";

        for(int i = 1; i <= runs; i++) {
            x = x + y;

            counter += (x+" ");

            temp = x;
            x = y;
            y = temp;
        }

        return counter;
    }
}
