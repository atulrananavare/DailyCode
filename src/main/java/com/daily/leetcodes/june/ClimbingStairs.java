package com.daily.leetcodes.june;

public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

// You are climbing a staircase. It takes n steps to reach the top.
//
//    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
    public static int climbStairs(int n) {
        int count=0;
        if(n <=1){
            return 1;
        }


        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
