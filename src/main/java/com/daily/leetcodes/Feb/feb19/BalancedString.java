package com.daily.leetcodes.Feb.feb19;

public class BalancedString {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
    }

    public static int balancedStringSplit(String s) {
        int count = 0;
        int result = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'R') count++;
            if (ch == 'L') count--;

            if (count == 0) {
                result++;
            }
        }
        return result;
    }
}
