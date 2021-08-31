package com.nonrookie.course;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DemoCollectors {

    public static void demonstration() {
        System.out.println("COLLECTORS");

        var myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1", "c3", "c21");
        var cList = myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        cList.sort((o1, o2) -> o1.length() < o2.length() ? 1 : -1);
        cList.add("");

        var cMap = myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toMap(
                        String::length,
                        s -> s,
                        (s1, s2) -> s1 + ", " + s2));
        System.out.println(cMap);

        var myIntList = Arrays.asList(1, -1, 18, 42, 18, 21, 0);
        System.out.println(myIntList.stream().collect(Collectors.summarizingInt(i -> i)));

        System.out.println(myIntList.stream()
                .collect(Collectors.groupingBy(i -> i % 6)));

        System.out.println(myIntList.stream()
                .collect(Collectors.partitioningBy(i -> i > 20)));

        System.out.println(
                myIntList.stream()
                        .collect(
                                Collectors.teeing(
                                        Collectors.summingInt(i -> i),
                                        Collectors.maxBy(Integer::compareTo),
                                        (sum, max) -> (double) max.orElse(0) / sum
                                )).toString());


    }

}
