package com.daily.leetcodes.Feb.feb7;

public class JewelsAndStones {

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("z", "ZZ"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
//        Input: jewels = "aA", stones = "aAAbbbb"
//        Output: 3
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
}
