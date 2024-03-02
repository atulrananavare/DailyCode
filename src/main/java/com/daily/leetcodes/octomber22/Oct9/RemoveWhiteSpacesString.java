package com.daily.leetcodes.octomber22.Oct9;

public class RemoveWhiteSpacesString {
    public static void main(String[] args) {
        //How to remove Whitespaces from String
        String str = "How to remove Whitespaces from String";

        String tem = str.replaceAll(" ", "");
      //  System.out.println(tem);
        char[] arr = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(arr[i])) {
                builder.append(arr[i]);
            }
        }
        System.out.println(builder.toString());
    }
}
