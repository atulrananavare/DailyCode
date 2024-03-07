package com.daily.JavaConcepts.collections;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "B");
        map.put("C", "BB");
        map.put("D", "BBB");
        map.put("E", "BBBB");
        map.put("F", "BBBBB");

        //HashMap to list conversion using entryset
        Set<Map.Entry<String, String>> entryset = map.entrySet();

        ArrayList<Map.Entry<String, String>> list = new ArrayList<>(entryset);

        ListIterator<Map.Entry<String, String>> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
