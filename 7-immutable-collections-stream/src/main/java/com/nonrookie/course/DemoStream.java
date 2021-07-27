package com.nonrookie.course;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DemoStream {

    public static void demonstration() {
        System.out.println("STREAM");

        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        IntStream.range(1, 4)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);

        System.out.println(IntStream.rangeClosed(1, 4).sum());

        System.out.println("Test order");
        myList
                .stream()
                .filter(s -> {
                    System.out.println("filter " + s);
                    return s.startsWith("c");
                })
                .map(s -> {
                    System.out.println("map " + s);
                    return s.toUpperCase();
                })
                .sorted()
                .forEach(System.out::println);

        System.out.println("Test lazy evaluation");
        System.out.println(myList
                .stream()
                .filter(s -> {
                    System.out.println("filter " + s);
                    return s.startsWith("c");
                })
                .map(s -> {
                    System.out.println("map " + s);
                    return s.toUpperCase();
                })
                .findFirst()
                .orElse(null)
        );
    }

}
