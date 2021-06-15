package com.nonrookie.course.strategy;

public class DefaultDeclarant extends BaseDeclarant {

    private String firstName;

    private String lastName;

    public DefaultDeclarant() {
    }

    public DefaultDeclarant(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
