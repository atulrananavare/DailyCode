package com.daily.Feb2024;

public class PalindromicSubstring {

    public static void main(String[] args) {
        PalindromicSubstring sp = new PalindromicSubstring();
        int count = sp.countSubstrings("aaa");
        System.out.println(count);
    }

    public boolean isPalindrome(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }

    public int countSubstrings(String s) {
        int ans = 0;
        int len = s.length();
        for(int i = 0; i< len; i++) {
            for(int j = i; j< len; j++) {
                if(isPalindrome(s, i, j)) ans++;
            }
        }
        return ans;
    }
}
