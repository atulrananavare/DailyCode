package com.daily.Oct9;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "WOW";

        int len = str.length();
        String temp = "";
        for (int i = len - 1; i >= 0; i--) {
            temp = temp + str.charAt(i);
        }

        if (temp.equalsIgnoreCase(str)) {
            System.out.println("String is palindrome");
        } else System.out.println("String is not a palindrome");
    }
}
