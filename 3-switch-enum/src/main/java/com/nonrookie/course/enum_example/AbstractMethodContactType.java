package com.nonrookie.course.enum_example;

public enum AbstractMethodContactType {

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
    };

    public abstract String process(Object object);

}
