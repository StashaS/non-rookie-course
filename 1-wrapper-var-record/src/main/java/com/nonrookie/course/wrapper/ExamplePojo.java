package com.nonrookie.course.wrapper;

import java.util.Objects;

public class ExamplePojo {

    private String name;

    private int age;

    private Integer birthdayYear;

    public ExamplePojo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getBirthdayYear() {
        return birthdayYear;
    }

    public void setBirthdayYear(Integer birthdayYear) {
        this.birthdayYear = birthdayYear;
    }

    @Override
    public String toString() {
        return "ExamplePojo{" +
                "name='" + name + '\'' +
                ", birthdayYear=" + birthdayYear +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamplePojo that = (ExamplePojo) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(birthdayYear, that.birthdayYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthdayYear);
    }
}
