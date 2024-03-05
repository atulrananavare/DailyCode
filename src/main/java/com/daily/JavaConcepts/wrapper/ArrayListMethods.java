package com.daily.JavaConcepts.wrapper;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(6);
        list1.add(12);
        list1.add(5);
        list1.add(13);
        list1.add(17);

        List<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(2);
        list2.add(10);
        list2.add(7);
        list2.add(4);
        list2.add(9);

        list1.addAll(list2); //[1, 6, 12, 5, 13, 17, 0, 2, 10, 7, 4, 9] append list2 at the end of list1
        System.out.println(list1);

        list1.removeAll(list2); //[1, 6, 12, 5, 13, 17] remove all list2 elements from list1
        System.out.println(list1);

        list1.addAll(2, list2);//[1, 6, 0, 2, 10, 7, 4, 9, 12, 5, 13, 17] add list2 element into list1 from 2nd position
        System.out.println(list1);

        list1.retainAll(list2);// Retains only the elements in this list that are contained in the specified collection
        System.out.println(list1);

        list1.clear(); //Removes all of the elements from this list
        System.out.println(list1);

    }
}
