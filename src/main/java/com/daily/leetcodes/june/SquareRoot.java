package com.daily.leetcodes.june;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }

    public static int mySqrt(int x) {

        if (x==0) return 0;
        if(x==1) return 1;
        int sqrt = (int) (x*0.5*0.5);
        return sqrt;

    }
}
