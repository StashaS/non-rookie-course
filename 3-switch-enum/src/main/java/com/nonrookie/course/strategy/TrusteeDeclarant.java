package com.nonrookie.course.strategy;

public class TrusteeDeclarant extends BaseDeclarant {

    private String firstName;

    private String lastName;

    private String docId;

    public TrusteeDeclarant() {
    }

    public TrusteeDeclarant(String firstName, String lastName, String docId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.docId = docId;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }
}
