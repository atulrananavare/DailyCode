package com.daily.Jan23.jan28;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfWord {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("AA","BB","BB","AA","CC","DD");
        System.out.println(list);

        Map<String, Long> list2 = list.stream().filter(str -> Collections.frequency(list, str) > 1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //Map<Object, Long> distStr = list.stream().filter(str-> Collections.frequency(list,str)>1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(list2);
    }
}
