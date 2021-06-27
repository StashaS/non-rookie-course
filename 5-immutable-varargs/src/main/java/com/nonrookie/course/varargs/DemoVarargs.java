package com.nonrookie.course.varargs;

public class DemoVarargs {

    public static void demonstration() {
        System.out.println("VARARGS");

        System.out.println(size()); // 0
        System.out.println(size("a", "b")); // 2
        System.out.println(size("a", "b", "c", "d", "e")); // 5
        String[] texts = {"a", "b", "c", "d", "e", "f", "g"};
        System.out.println(size(texts)); // 7

    }

    private static int size(String... texts) {
        var a = texts;
        return a.length;
    }

//    private static int size(String test, String... texts) {
//        return -1;
//    }

}
