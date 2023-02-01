package com.daily.Jan.jan28;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWord {
    public static void main(String[] args) {
        //step1:
        List<String> list= Arrays.asList("AA","BB","BB","AA","CC","DD","AA");
        System.out.println(list);

        //java8
        Map<String, Long> list2 = list.stream().filter(str -> Collections.frequency(list, str) > 1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //Map<Object, Long> distStr = list.stream().filter(str-> Collections.frequency(list,str)>1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(list2);
    }
}
