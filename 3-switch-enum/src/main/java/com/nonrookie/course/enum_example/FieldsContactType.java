package com.nonrookie.course.enum_example;

public enum FieldsContactType {

    DECLARANT("Declarant", "adult"),
    TRUSTEE("Trustee", "adult"),
    LEGAL_REPRESENTATIVE("LegalRepresentative", "company"),
    CONTACT("Contact", "unknown"),
    CHILD("Child", "child"),
    SPOUSE("Spouse", "adult"),
    RELATIVE("Relative", "unknown"),
    OTHER("Other", "unknown"),
    FATHER("Father", "adult"),
    MOTHER("Mother", "adult");

    private final String value;

    private final String status;

    private FieldsContactType(String value, String status) {
        this.value = value;
        this.status = status;
    }

    public String getValue() {
        return this.value;
    }

    public String getStatus() {
        return this.status;
    }

}
