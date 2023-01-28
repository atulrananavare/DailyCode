package com.daily.Jan23.jan28;

//how to check given number is positive or negative or zero
public class CheckNumbers {

    public static void main(String[] args) {

        int num=0;

        String givennum = givenNumber(num);
        System.out.println(givennum);
    }


    public static String givenNumber(Integer num) {

        String result = (num > 0) ? "positive number" : (num < 0) ? "negative number" : "number is 0";

        return result;
    }
}
