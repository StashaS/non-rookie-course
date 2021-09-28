package com.nonrookie.course;

/**
 * Description
 *
 * @author ASarycheva
 * @version %I%, %G%
 */
public class DemoPatternMatchingForSwitch {

    public static void demonstration() {
        System.out.println("PATTERN MATCHING FOR SWITCH");

        System.out.println("if-else + pattern matching - " + formatterOld(15));
        System.out.println("pattern matching for switch - " + formatterPatternSwitch(15));

        System.out.println("pattern matching for switch - " + formatterPatternSwitch(null));

        System.out.println("pattern matching for switch - " + switchAndExpression(3));
        System.out.println("pattern matching for switch - " + switchAndExpression(15));
    }

    private static String formatterOld(Object o) {
        String formatted = "unknown";
        if (o instanceof Integer i) {
            formatted = String.format("int %d", i);
        } else if (o instanceof Long l) {
            formatted = String.format("long %d", l);
        } else if (o instanceof Double d) {
            formatted = String.format("double %f", d);
        } else if (o instanceof String s) {
            formatted = String.format("String %s", s);
        }
        return formatted;
    }

    private static String formatterPatternSwitch(Object o) {
        return switch (o) {
            case null -> "null value";
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("String %s", s);
            default -> o.toString();
        };
    }

    private static String switchAndExpression(Object o) {
        return switch (o) {
            case null -> "null value";
            case Integer i && i > 5 -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("String %s", s);
            default -> o.toString();
        };
    }

}
