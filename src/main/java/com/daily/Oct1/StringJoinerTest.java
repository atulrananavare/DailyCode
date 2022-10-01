package com.daily.Oct1;

import java.util.StringJoiner;


//Understanding of StringJoiner concept
public class StringJoinerTest {
    public static void main(String[] args) {

        StringJoiner joiner1 = new StringJoiner(",");
        joiner1.add("A").add("B").add("C");
        StringJoiner joiner2 = new StringJoiner(":");
        joiner2.add("P").add("Q").add("R");

        joiner1.merge(joiner2);
        System.out.println(joiner1);

    }
}
