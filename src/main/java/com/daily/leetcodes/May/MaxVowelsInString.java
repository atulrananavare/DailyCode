package com.daily.leetcodes.May;

public class MaxVowelsInString {

    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef",3));
    }

    public static int maxVowels(String s, int k) {
        int ans = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (isvowel(i, s)) {
                count++;
            }
        }
        ans = Math.max(ans, count);
        for (int i = k; i < s.length(); i++) {
            if (isvowel(i - k, s)) {
                count--;
            }
            if (isvowel(i, s)) {
                count++;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }

    public static boolean isvowel(int n, String s) {
        if (s.charAt(n) == 'a' || s.charAt(n) == 'e' || s.charAt(n) == 'i' || s.charAt(n) == 'o' || s.charAt(n) == 'u') {
            return true;
        } else {
            return false;
        }
    }
}
