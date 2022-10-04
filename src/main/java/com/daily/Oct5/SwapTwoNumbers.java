package com.daily.Oct5;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //without using third variable

        b=a+b; //b=30
        a=b-a; //a=20
        b=b-a; //b=10

        System.out.printf("a is %d, b is %d", a, b); // a is 10, b is 20

    }
}
