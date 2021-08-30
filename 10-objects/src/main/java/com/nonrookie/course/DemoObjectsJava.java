package com.nonrookie.course;

import java.util.List;
import java.util.Objects;

public class DemoObjectsJava {

    public static void demonstration() {
        System.out.println("OBJECTS");

        System.out.println(Objects.toString(5));
        System.out.println(Objects.toString(null));
        System.out.println(Objects.toString(5, "It is null!"));
        System.out.println(Objects.toString(null, "It is null!"));

        var list = List.of(1, 2, 3, 4, 5);
        var index = 9;
        try {
            Objects.checkIndex(index, list.size());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

//        Objects.requireNonNull(null, "It is null!");
        System.out.println(Objects.requireNonNullElse(null, "default"));

        if (list != null) {
            System.out.println("List is not null");
        }

        if (Objects.nonNull(list)) {
            System.out.println("List is not null");
        }

        if (list == null) {
            System.out.println("List is null");
        }

        if (Objects.isNull(list)) {
            System.out.println("List is null");
        }

        System.out.println(Objects.equals(5, 5));
        System.out.println(Objects.equals(null, 5));
        System.out.println(Objects.equals(null, null));
    }

}
