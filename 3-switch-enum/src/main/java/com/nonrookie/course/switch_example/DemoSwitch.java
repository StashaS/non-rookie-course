package com.nonrookie.course.switch_example;

import com.nonrookie.course.enum_example.SimpleContactType;

public class DemoSwitch {

    public static void demonstration() {
        System.out.println("SWITCH");
        switchJava8(1, 3, SimpleContactType.DECLARANT, "string2");

        System.out.println("Switch expressions");
        switchExpressionsBefore(SimpleContactType.LEGAL_REPRESENTATIVE);
        switchExpressionsBefore(SimpleContactType.CHILD);
        switchExpressionsAfter(SimpleContactType.LEGAL_REPRESENTATIVE);
        switchExpressionsAfter(SimpleContactType.CHILD);

        System.out.println("Yield");
        switchYield(SimpleContactType.LEGAL_REPRESENTATIVE);
        switchYield(SimpleContactType.CHILD);
    }

    // примитивы и обертки, enum, String
    private static void switchJava8(int primitive, Integer wrapper, SimpleContactType contact, String string) {
        switch (primitive) {
            case 1:
                System.out.println("First value");
                break;
            case 2:
                System.out.println("Second value");
                break;
            default:
                System.out.println("Default value");
        }

        switch (wrapper) {
            case 1:
            case 2:
                System.out.println("First or second value");
                break;
            default:
                System.out.println("Default value");
        }

        switch (contact) {
            case DECLARANT:
                System.out.println("Declarant value");
                break;
            case TRUSTEE:
                System.out.println("Trustee value");
                break;
            default:
                System.out.println("Default value");
        }

        switch (string) {
            case "string1":
                System.out.println("First value");
                break;
            case "string2":
                System.out.println("Second value");
                break;
            default:
                System.out.println("Default value");
        }
    }

    private static void switchExpressionsBefore(SimpleContactType contact) {
        boolean isPossibleApplicant;
        switch (contact) {
            case DECLARANT:
            case TRUSTEE:
            case LEGAL_REPRESENTATIVE:
                isPossibleApplicant = true;
                break;
            default:
                isPossibleApplicant = false;
        }
        System.out.println("contact = " + contact + ", isPossibleDeclarant = " + isPossibleApplicant);
    }

    // Java 12 Preview, Java 14 - syntax
    private static void switchExpressionsAfter(SimpleContactType contact) {
        boolean isPossibleApplicant = switch (contact) {
            case DECLARANT, TRUSTEE, LEGAL_REPRESENTATIVE -> true;
            default -> false;
        };
        System.out.println("contact = " + contact + ", isPossibleDeclarant = " + isPossibleApplicant);

        switch (contact) {
            case DECLARANT, TRUSTEE, LEGAL_REPRESENTATIVE -> System.out.println("is possible applicant");
            default -> {
                System.out.println("contact = " + contact);
                System.out.println("can't be applicant");
            }
        }
    }

    // Java 13 Preview, Java 14 - syntax
    private static void switchYield(SimpleContactType contact) {
        var text = switch (contact) {
            case DECLARANT, TRUSTEE, LEGAL_REPRESENTATIVE -> "is possible applicant";
            default -> {
                String line = "contact is " + contact;
                yield line + " can't be applicant";
            }
        };
        System.out.println("text = " + text);

        // old switch syntax + yield
        var text1 = switch (contact) {
            case DECLARANT:
            case TRUSTEE:
            case LEGAL_REPRESENTATIVE:
                yield "is possible applicant";
            default:
                var line = "contact is " + contact;
                yield line + " can't be applicant";
        };
        System.out.println("text1 = " + text);
    }

}
