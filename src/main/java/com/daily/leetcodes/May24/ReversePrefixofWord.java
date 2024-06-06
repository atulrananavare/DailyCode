package com.daily.leetcodes.May24;

public class ReversePrefixofWord {
    public static void main(String[] args) {

        System.out.println(reversePrefix("abcdefd",'d'));
    }

    //    Input: word = "abcdefd", ch = "d"
//    Output: "dcbaefd"
        public static String reversePrefix(String word, char ch) {
            int i = 0;
            int j = word.indexOf(ch);

            char chars[] = word.toCharArray();
            while(i < j) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
            return new String(chars);
        }
}
