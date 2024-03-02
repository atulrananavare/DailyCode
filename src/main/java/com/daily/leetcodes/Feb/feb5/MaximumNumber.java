package com.daily.leetcodes.Feb.feb5;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;

//        int max=a;
//        if(b>max && b>c){
//            System.out.println("MAX is:"+b);
//        } else if (c>max && c>b) {
//            System.out.println("MAX is:"+c);
//        }
//        else System.out.println("MAX is:"+a);

        int max=Math.max(a,Math.max(b,c));
        System.out.println(max);
    }
}
