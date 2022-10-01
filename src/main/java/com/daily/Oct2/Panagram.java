package com.daily.Oct2;

import java.util.Locale;

public class Panagram {

    public static void main(String[] args) {
        String str = "Abcdefghijklmnopqrstuvwxy";
        System.out.println(isPanagram(str.toLowerCase()));

    }

    public static boolean isPanagram(String str) {
        if (str.length() < 26) {
            return false;
        } else {
            for (char c = 'a'; c < 'z'; c++) {
                if (str.indexOf(c) < 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
