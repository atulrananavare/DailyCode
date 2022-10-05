package com.daily.Oct6;

public class IsPrimeNumber {
    public static void main(String[] args) {
        int num = 11;

        //prime number-->2,3,5,7,11
        System.out.println(isPrime(num));
    }

    private static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


}
