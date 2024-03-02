package com.daily.leetcodes.Feb.feb6;

public class DefangingIPAdress {
    //A defanged IP address replaces every period "." with "[.]"
    //Input: address = "1.1.1.1"
    //Output: "1[.]1[.]1[.]1"

    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }

    public static String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
