package com.nonrookie.course.enum_example;

import java.util.Arrays;

public class DemoEnum {

    public static void demonstration() {
        System.out.println("ENUM");

        System.out.println("Simple enum usage");
        simpeEnum();
        fieldEnum();
        abstractMethodEnum();
        defaultMethodEnum();

    }

    private static void simpeEnum() {
        Enum enum1;
        System.out.println("---simpeEnum---");
        System.out.println(SimpleContactType.CONTACT.ordinal());
        System.out.println(SimpleContactType.CONTACT.name());
        System.out.println(Arrays.toString(SimpleContactType.values()));
        SimpleContactType testContactOne = SimpleContactType.FATHER;
        SimpleContactType testContactTwo = SimpleContactType.FATHER;
        System.out.println(testContactOne == testContactTwo);
    }


    private static void fieldEnum() {
        System.out.println("---fieldEnum---");
        System.out.println(FieldsContactType.CHILD.getValue());
        System.out.println(FieldsContactType.RELATIVE.getStatus());
    }

    private static void abstractMethodEnum() {
        System.out.println("---abstractMethodEnum---");
        System.out.println(AbstractMethodContactType.DECLARANT.process(new Object()));
        System.out.println(AbstractMethodContactType.LEGAL_REPRESENTATIVE.process(new Object()));
    }

    private static void defaultMethodEnum() {
        System.out.println("---defaultMethodEnum---");
        System.out.println(DefaultMethodContactType.DECLARANT.process(new Object()));
        System.out.println(DefaultMethodContactType.MOTHER.process(new Object()));
    }

}
