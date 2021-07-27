package com.nonrookie.course;

import java.util.*;

import static java.util.Map.entry;

public class DemoImmutableCollection {

    public static void demonstration() {
        System.out.println("IMMUTABLE COLLECTION");

        // Immutable List, Java 8
        List<String> stringList = Arrays.asList("a", "b", "c");
        stringList = Collections.unmodifiableList(stringList);

        // Immutable Set, Java 8
        Set<String> stringSet = new HashSet<>(Arrays.asList("a", "b", "c"));
        stringSet = Collections.unmodifiableSet(stringSet);

        // Immutable Map, Java 8
        Map<String, Integer> stringMap = new HashMap<String, Integer>();
        stringMap.put("a", 1);
        stringMap.put("b", 2);
        stringMap.put("c", 3);
        stringMap = Collections.unmodifiableMap(stringMap);

        // Immutable List, Java 9
        var stringList2 = List.of("a", "b", "c");

        // Immutable Set, Java 9
        var stringSet2 = Set.of("a", "b", "c");

        // Immutable Map, Java 9
        var stringMap2 = Map.of("a", 1, "b", 2, "c", 3);
        var stringMap3 = Map.ofEntries(
                entry("a", 1),
                entry("b", 2),
                entry("c", 3));
    }

}
