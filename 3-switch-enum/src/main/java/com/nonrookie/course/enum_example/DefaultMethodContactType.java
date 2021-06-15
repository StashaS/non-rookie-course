package com.nonrookie.course.enum_example;

public enum DefaultMethodContactType {

    DECLARANT {
        @Override
        public String process(Object object) {
            return "some text";
        }
    },
    TRUSTEE {
        @Override
        public String process(Object object) {
            return "some trustee text";
        }
    },
    LEGAL_REPRESENTATIVE {
        @Override
        public String process(Object object) {
            return "some extra text";
        }
    },
    CONTACT, CHILD, SPOUSE, RELATIVE, OTHER, FATHER, MOTHER;

    public String process(Object object) {
        return "default process";
    }

    ;

}
