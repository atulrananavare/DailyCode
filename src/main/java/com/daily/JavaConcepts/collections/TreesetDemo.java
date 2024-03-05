package com.daily.JavaConcepts.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(23);
        treeSet.add(54);
        treeSet.add(21);
        treeSet.add(1);
        treeSet.add(0);
        treeSet.add(56);
        treeSet.add(32);
        treeSet.add(7);

        System.out.println(treeSet);//[0, 1, 7, 21, 23, 32, 54, 56]

        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() +" ");
        }

        treeSet.add(null);  //NPE if we add null in treeset
        while (iterator.hasNext()){
            System.out.print(iterator.next() +" ");
        }

    }
}
