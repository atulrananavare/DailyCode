package com.daily.octomber22.Oct8;

public class PalindromeCheck {
    public static void main(String[] args) {
        //A palindrome string is one whose reverse is also the same string.
        String str = "MADAM".toLowerCase();
        char[] arr = str.toLowerCase().toCharArray();
        char[] temp = new char[arr.length];
        for (int i = arr.length - 1; i > 0; i--) {
            temp[i] = str.charAt(i);
        }

        String s = temp.toString();
        if (s == str) {
            System.out.println("A palindrome string");
        } else {
            System.out.println("Not palindrome string");
        }
    }
}
