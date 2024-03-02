package com.daily.JavaConcepts.wrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTraversing {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(12);
        list.add(5);
        list.add(13);
        list.add(17);

        ListIterator iterator = list.listIterator();
        System.out.println("Forward direction iterator.....");
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }

        System.out.println(" ");
        System.out.println("Backward direction iterator.....");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() +" ");
        }
    }
}
