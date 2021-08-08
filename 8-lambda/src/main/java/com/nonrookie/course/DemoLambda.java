package com.nonrookie.course;

import java.util.function.Function;

public class DemoLambda {

    public static void demonstration() {
        System.out.println("LAMBDA");

        printCode(new Student(), "Tom123");

        Convertable anonClass = new Convertable() {
            @Override
            public int getCode(String text) {
                return text.length();
            }
        };
        printCode(anonClass, "John123");

        Convertable funcInterface = k -> k.length();
        printCode(funcInterface, "Sarah234");

        printCode(k -> k.length(), "Kate456");
        printCode((var k) -> k.length(), "Kate456");
        printCode(String::length, "Kate456");

        printCodeFunction(String::length, "Mary123");
    }

    private static void printCode(Convertable convertable, String text) {
        System.out.println(text + " " + convertable.getCode(text));
    }

    private static void printCodeFunction(Function<String, Integer> function, String text) {
        System.out.println(text + " " + function.apply(text));
    }

}
