package com.daily.octomber23;

public class WinnerOfGameColour {

    public static void main(String[] args) {
        System.out.println(winnerOfGame("ABBBBBBBAAA"));
    }

    //All we need to count of subsequence "AAA" and "BBB"
    public static boolean winnerOfGame(String colors) {
        int alice =0;
        int bob =0;

        for(int i=1; i<colors.length()-1; i++){
            if(colors.charAt(i-1)==colors.charAt(i) && colors.charAt(i)==colors.charAt(i+1)){
                if(colors.charAt(i)=='A'){
                    alice++;
                }else {
                    bob++;
                }
            }
        }
        return alice > bob ? true : false;
    }
}
