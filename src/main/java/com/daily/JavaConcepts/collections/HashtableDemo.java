package com.daily.JavaConcepts.collections;

import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(1, "atul");
        hashtable.put(2,"Shubh");
        hashtable.put(5, "atul12");
        hashtable.put(8,"Shubh21");

        System.out.println(hashtable);

        //hashtable.put(null,"null check"); //NPE as null key is not allowed
        hashtable.put(4,null);
        System.out.println(hashtable); //NPE as null value is not allowed
    }
}
