package com.nonrookie.course;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DemoString {

    public static void demonstration() {
        demoJava8();
        demoJava11();
        demoJava12();
        demoJava13();
        demoJava14();
    }

    private static void demoJava8() {
        System.out.println("String Java 8");

        var names = Arrays.asList("TOM", "Alice", "bob", "jOHN", "SaRaH");
        names.sort(String::compareToIgnoreCase);
        System.out.println(String.join(", ", names));

        var name1 = "TOM";
        var name2 = "toM";
        System.out.println(String.format("The name %s is %s ignore case with the name %s",
                name1,
                name1.equalsIgnoreCase(name2) ? "equals" : "not equals",
                name2));

        System.out.println(String.format("String checker for null - %s", stringCheckerJava8(null)));
        System.out.println(String.format("String checker for \"  \" - %s", stringCheckerJava8("  ")));
        System.out.println(String.format("String checker for \"Alice\" - %s", stringCheckerJava8("Alice")));
    }

    private static boolean stringCheckerJava8(String str) {
        return str != null && !str.trim().isEmpty();
    }

    private static void demoJava11() {
        System.out.println("String Java 11");

        System.out.println("Text ".repeat(10));

        System.out.println("\t\t\u2000Text\tanother text \u0020 \n".trim());
        System.out.println("\t\t\u2000Text\tanother text \u0020 \n".strip()); // больше символов
        System.out.println("\t\t\u2000Text\tanother text \u0020 \n".stripTrailing());

        System.out.println(String.format("String checker for null - %s", stringCheckerJava11(null)));
        System.out.println(String.format("String checker for \"  \" - %s", stringCheckerJava11("  ")));
        System.out.println(String.format("String checker for \"Alice\" - %s", stringCheckerJava11("Alice")));

        "Alice\nbob\rjOHN\r\nSaRaH, TOM".lines().forEach(System.out::println);
    }

    private static boolean stringCheckerJava11(String str) {
        return str != null && !str.isBlank();
    }

    private static void demoJava12() {
        System.out.println("String Java 12");

        var lineAfterIndent = "Alice\nbob\rjOHN\r\nSaRaH, TOM".indent(5);
        System.out.println(lineAfterIndent);
        System.out.println(lineAfterIndent.indent(-10));

        var beforeTransform = " SaRaH Alice jOHN TOM bob\n";
        var afterTransform1 = DemoString.formatNames(beforeTransform.trim().toLowerCase());
        System.out.println(afterTransform1);

        var afterTransform2 = beforeTransform
                .transform(String::trim)
                .transform(String::toLowerCase)
                .transform(DemoString::formatNames);
        System.out.println(afterTransform2);
    }

    public static String formatNames(String str) {
        var list = Arrays.stream(str.split(" "))
                .map(StringUtils::capitalize)
                .sorted(String::compareTo)
                .collect(Collectors.toList());
        return String.join(", ", list);
    }

    private static void demoJava13() {
        System.out.println("String Java 13");

        var strTextBlock = """
                {
                    "name": "Alice",
                    "email": "alice@test.com"
                }
                """;
        System.out.println(strTextBlock);

        var strTextBlock2 = """
                    {
                        "name": "Alice2",
                        "email": "alice2@test.com"
                    }
                """;
        System.out.println(strTextBlock2);
        System.out.println(strTextBlock2.stripIndent());

        var strTextBlock3 = """
                text\\another\t\ttext""";
        System.out.println(strTextBlock3);

        var strTextBlock4 = """
                {
                    "name": "%s",
                    "email": "%s"
                }
                """.formatted("Bob", "bob@test.com");
        System.out.println(strTextBlock4);

        var strTextBlock5 = """
                text another\\t\\ttext""";
        System.out.println(strTextBlock5);
        System.out.println(strTextBlock5.translateEscapes());

        var strTextBlock6 = "    First\n" +
                            "        Second\n" +
                            "    Third";
        System.out.println(strTextBlock6.stripIndent());

        var name = "Tom";
        var email = "tom@test.com";
        var strTextBlock7 = """
                {
                    "name": "$name",
                    "email": "$email"
                }
                """.replace("$name", name)
                .replace("$email", email);
        System.out.println(strTextBlock7);
    }

    private static void demoJava14() {
        System.out.println("String Java 14");

        var strTextBlock = """
                A very very very very very very very \
                very very very very very very very very very \
                very very very very very very very very \
                very very long text
                """;
        System.out.println(strTextBlock);

        var strTextBlock2 = """
                A text        \s
                with a space
                """;
        System.out.println(strTextBlock2);
    }

}
