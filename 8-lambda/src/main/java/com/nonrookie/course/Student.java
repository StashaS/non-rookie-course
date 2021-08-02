package com.nonrookie.course;

public class Student implements Convertable {

    @Override
    public int getCode(String text) {
        return text.length();
    }
}
