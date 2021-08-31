package com.nonrookie.course;

import java.util.Optional;
import java.util.OptionalInt;

public class DemoOptional {

    public static void demonstration() {
        System.out.println("OPTIONAL");

        Optional<String> emptyOptional = Optional.empty();
        var emptyOptional2 = Optional.empty();
        var optional = Optional.of("new optional");
        var testOptional = getText("test");
        printTextLength("text");
        printTextLengthOptional(Optional.of("text"));

        System.out.println(setDefaultOptionalOrElse(Optional.of("test")));

        var text1 = Optional.of("test").get();
        var text2 = Optional.of("test").orElse("default");

        System.out.println(testFilter(Optional.of("1234")));
        System.out.println(testMap(Optional.of("1234")));

        OptionalInt optionalInt = OptionalInt.of(16);
    }

    private static Optional<String> getText(String text) {
        return Optional.ofNullable(text);
    }

    private static void printTextLength(String text) {
        if (text != null) {
            System.out.println(text.length());
        } else {
            System.out.println("something else");
        }
    }

    private static void printTextLengthOptional(Optional<String> text) {
        text.ifPresentOrElse(t -> System.out.println(t.length()),
                () -> System.out.println("something else"));
    }

    private static String setDefault(String text) {
        return text != null ? text : "default";
    }

    private static String setDefaultOptionalOrElse(Optional<String> text) {
        return text.orElse("default");
    }

    private static String setDefaultOptionalOrElseGet(Optional<String> text) {
        return text.orElseGet(() -> "default");
    }

    private static boolean testFilter(Optional<String> text) {
        return text
                .filter(t -> t.startsWith("1"))
                .filter(t -> t.length() > 3)
                .isPresent();
    }

    private static String testMap(Optional<String> text) {
        return text
                .filter(t -> t.startsWith("1"))
                .filter(t -> t.length() == 4)
                .map(t -> t + "5")
                .orElse("default");
    }

}
