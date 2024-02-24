package com.daily.july;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String columnTitle = "AB";

        System.out.println(titleToNumber(columnTitle));

    }

    public static int titleToNumber(String columnTitle) {
        int res = 0;
        for (char c : columnTitle.toCharArray()) {
            int delta = c - 'A' + 1;
            res = res*26 +delta;
        }

        return res;
    }
}
