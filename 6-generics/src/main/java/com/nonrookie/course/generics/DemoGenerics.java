package com.nonrookie.course.generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class DemoGenerics {

    public static void demonstration() {
        System.out.println("GENERICS");

        NonGenericExample nonGenericExample = new NonGenericExample("test", "name1");
        String value = (String) nonGenericExample.getValue();

        var genericExample = new GenericExample<>("test", "name2");
        String value2 = genericExample.getValue();

        var genericExample4 = new GenericExample<>();
        genericExample4.setValue(new NonGenericExample(1, "1"));

        List<NonGenericExample> list = new ArrayList<>();
        list.add(nonGenericExample);
        list.add(new NonGenericExample("super text", "super name"));
        list.sort(new CustomCompare());

        List<Map<String, GenericExample<Integer>>> madness;

        GenericExample genericExample2 = new GenericExample("Third text", "Third name");
        // String value3 = genericExample2.getValue();

        secondGenericMethod(genericExample);

        List<?> wildcardList1;
        List<? super NonGenericExample> wildcardList2;
        List<? extends NonGenericExample> wildcardList3;

    }

    public static <T> void oneGenericMethod(T value1, T value2) {
        // ...
    }

    public static <T extends GenericExample<String>> void secondGenericMethod(T value1) {
        System.out.println("secondGenericMethod is " + value1.getName());
    }

//    public static void test1(List<String> value) {
//        System.out.println("test1");
//    }

    public static void test1(List<Integer> value) {
        System.out.println("test2");
    }

    @SafeVarargs
    public static <T> void test2(T... args) {
        System.out.println("Test varargs method");
    }

    static class CustomCompare implements Comparator<NonGenericExample> {

        @Override
        public int compare(NonGenericExample o1, NonGenericExample o2) {
            return o1.getName() != null ? o1.getName().compareTo(o2.getName()) : 1;
        }

    }

}
