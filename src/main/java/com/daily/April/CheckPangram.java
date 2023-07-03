package com.daily.April;

public class CheckPangram {
    //    A pangram is a sentence where every letter of the English alphabet appears at least once.
//
//    Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println(checkIfPangram(sentence));
    }


    public static boolean checkIfPangram(String sentence) {

        boolean[] seen = new boolean[26]; // 26 letters in the alphabet

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isLetter(c)) {
                int index = Character.toLowerCase(c) - 'a'; // convert to index in seen array
                seen[index] = true;
            }
        }

// Check if all letters have been seen
        boolean allLettersSeen = true;
        for (boolean letterSeen : seen) {
            if (!letterSeen) {
                allLettersSeen = false;
                break;
            }
        }

        if (allLettersSeen) {
            return true;
        } else {
            return false;
        }

    }

}
