package com.nonrookie.course.immutable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DemoImmutable {

    private final static Date TODAY = new Date(); //today

    public static void demonstration() {
        System.out.println("MUTABLE BUGS");

        System.out.println("1. Risk of mutation");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Sum list is: " + sumList(list));
        System.out.println("Sum list is: " + sumList(list));
        System.out.println("Sum list is: " + sumList(list));

        System.out.println("2. Return mutable");
        System.out.println("Today is: " + TODAY);
        Date today = getToday();
        today.setHours(today.getHours() + 24);
        Date tomorrow = today;
        System.out.println("Tomorrow is: " + tomorrow);
        System.out.println("Today is: " + TODAY);

        System.out.println("3. Aliasing");
        List<Integer> list2 = process(list);
        // делаем несколько изменений с list2 и удивляемся почему изменился list
        System.out.println("Size list is: " + list.size());
        System.out.println("Sum list2 is: " + sumList(list2));
        System.out.println("Size list is: " + list.size());
    }

    private static int sumList(List<Integer> list) {
        int sum = list.stream().reduce(0, Integer::sum);
        list.add(5);
        return sum;
    }

    private static Date getToday() {
        return TODAY;
    }

    private static List<Integer> process(List<Integer> list) {
        // process
        return list;
    }

}
