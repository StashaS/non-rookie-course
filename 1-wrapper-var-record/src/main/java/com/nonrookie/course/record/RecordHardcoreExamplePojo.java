package com.nonrookie.course.record;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.io.Serializable;

public record RecordHardcoreExamplePojo<T>(
        String name,
        @Positive(message = "Value age is ${validatedValue} but must be greater than zero.")
        int age,
        @NotNull(message = "Value birthdayYear is null")
        @Positive(message = "Value birthdayYear is ${validatedValue} but must be greater than zero.")
        Integer birthdayYear,
        T info) implements ProcessablePerson, Serializable {

    public static int personCount;

    @Override
    public boolean checkAge() {
        return age >= 18;
    }

    // переопределение генерируемого конструктора
    public RecordHardcoreExamplePojo {
        if (name == null) {
            name = "default name";
        }
        personCount++;
    }

    public RecordHardcoreExamplePojo(String name) {
        this(name, 0, null, null);
    }

    public void printNameAndAge() {
        System.out.println(name + " " + age + ", current count " + personCount);
    }

}

