package com.daily.Oct3;

import java.util.*;

import static java.util.Arrays.asList;

public class EqualFrequency {

    public static void main(String[] args) {
        String word = "abcc";
        System.out.println(equalFrequency(word));
        //equalFrequency(word);
    }

    public static boolean equalFrequency(String word) {
        Map<Character, Integer> counts = new HashMap<>();
        for(char ch: word.toCharArray()){
            counts.put(ch, counts.getOrDefault(ch, 0)+1);
        }

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            int count = counts.get(ch);
            counts.put(ch, count-1);
            if(isEqual(counts)){
                return true;
            }
            counts.put(ch, count);
        }
        return false;
    }

    private static boolean isEqual(Map<Character, Integer> counts){
        int value = -1;
        for(Integer count: counts.values()){
            if(count == 0){
                continue;
            }else if(value == -1){
                value = count;
            } else if(value != count){
                return false;
            }
        }
        return true;
    }
}
