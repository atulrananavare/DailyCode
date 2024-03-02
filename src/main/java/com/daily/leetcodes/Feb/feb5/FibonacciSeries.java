package com.daily.leetcodes.Feb.feb5;

public class FibonacciSeries {

    public static void main(String[] args) {
       fib(10);
    }

    //0,1,1,2,3,5,8
    private static void fib(int num) {
        int n1=0;
        int n2=1;
        int n3;

        System.out.println(": "+n1);
        System.out.println(": "+n2);

        for(int i=2;i<num;i++){
            n3=n1+n2;
            System.out.println(": "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
