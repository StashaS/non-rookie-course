package com.nonrookie.course.generics;

public class GenericExample<T> {

    private T value;

    private String name;

    public GenericExample(){}

    public GenericExample(T value, String name) {
        this.value = value;
        this.name = name;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
