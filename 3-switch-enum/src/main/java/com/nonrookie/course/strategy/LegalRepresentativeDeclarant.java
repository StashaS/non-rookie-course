package com.nonrookie.course.strategy;

public class LegalRepresentativeDeclarant extends BaseDeclarant {

    private String firstName;

    private String lastName;

    private String relation;

    public LegalRepresentativeDeclarant() {
    }

    public LegalRepresentativeDeclarant(String firstName, String lastName, String relation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.relation = relation;
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

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }
}
