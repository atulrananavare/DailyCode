package com.daily.Jan.jan26;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Check if the all the list are div by 2 if YEs, then print "All the elements divisable by two" else print "All the elements are not divisable by two" using java 8
//Check at least one number divisable by two
public class CheckListDivByTwo {

    public static void main(String[] args) {
        //use java8
        List<Integer> elements= Arrays.asList(2,4,6,5,8);

        //Way1:
        List<Integer> list = elements.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        if(list.size()==elements.size()){
            System.out.println("All the elements divisable by two:Way1");
        }else{
            System.out.println("All the elements are not divisable by two:Way1");
        }

        //Way2:
        boolean divByTwo = elements.stream().allMatch(num -> num % 2 == 0);
        if(divByTwo){
            System.out.println("All the elements divisable by two:Way2");
        }else{
            System.out.println("All the elements are not divisable by two:Way2");
        }

        //CHeck2:
        boolean anyOne = list.stream().anyMatch(num -> num % 2 == 0);
        if(anyOne){
            System.out.println("One elements divisable by two:Check2");
        }else{
            System.out.println("One elements not divisable by two:Check2");
        }
    }


}
