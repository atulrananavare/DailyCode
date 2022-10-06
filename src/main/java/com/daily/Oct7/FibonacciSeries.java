package com.daily.Oct7;

public class FibonacciSeries {
    public static void main(String[] args) {

        fib(10);

    }

    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …….. ... F0 = 0 and F1 = 1.
    private static void fib(int num) {
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 0; i <= num; i++) {
            System.out.println(a + ",");
            a = b;
            b = c;
            c = a + b;
        }

        System.out.println(fibo(num));
    }

    private static int fibo(int num) {
        if (num <= 1) {
            return num;
        }
        return fibo(num - 1) + fibo(num - 2);
    }
}
