package com.daily.octomber23;

public class ReverseString3 {
    public static void main(String[] args) {
        String s = "God Ding";
        System.out.println(reverseWords(s));
    }

//    Input: s = "God Ding"
//    Output: "doG gniD"
                    public static String reverseWords(String s) {
                        String[] words = s.split(" ");
                        StringBuilder temp = new StringBuilder();
                        for (int i = 0; i< words.length; i++) {
                            String word = words[i];
                            String reverseWord = reverse(word);
                            // Append the reversed word to the StringBuilder
                            temp.append(reverseWord);

            // Add a space if it's not the last word
            if (i < words.length - 1) {
                temp.append(" ");
            }
        }
       return temp.toString();
    }

    public static String reverse(String str){
        StringBuilder reversedWord = new StringBuilder();
        // Iterate through the characters of the word in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedWord.append(str.charAt(i));
        }
        return reversedWord.toString();
    }
}
