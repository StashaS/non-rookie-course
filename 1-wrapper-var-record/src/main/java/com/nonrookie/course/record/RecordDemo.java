package com.nonrookie.course.record;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import java.util.Set;

public class RecordDemo {

    public static void demonstration(){
        simpleUsage();

        Record record;
        hardcoreUsage();
    }

    private static void simpleUsage(){
        System.out.println("RECORD");
        var recordTest = new RecordExamplePojo("test", 20, 2001);
        System.out.println(recordTest);
    }

    private static void hardcoreUsage(){
        var recordTest1 = new RecordHardcoreExamplePojo<>("Oleg", 20, 2001, "information");
        printHardcoreExample(recordTest1);

        var recordTest2 = new RecordHardcoreExamplePojo<>("Boris", 10, -1, 42);
        printHardcoreExample(recordTest2);

        var recordTest3 = new RecordHardcoreExamplePojo<String>("Kate");
        printHardcoreExample(recordTest3);

        var recordTest4 = new RecordHardcoreExamplePojo<String>(null, 30, null, null);
        printHardcoreExample(recordTest4);
    }

    private static <T> void printHardcoreExample(RecordHardcoreExamplePojo<T> record){
        System.out.println(record);
        System.out.println("Check age: " + record.checkAge());
        record.printNameAndAge();
        printValidation(record);
        System.out.println();
    }

    private static <T> void printValidation(RecordHardcoreExamplePojo<T> record){
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<RecordHardcoreExamplePojo<T>>> constraintViolations = validator.validate( record );

        System.out.println("Validation errors: " + constraintViolations.size());
        constraintViolations.forEach(error -> System.out.println(error.getMessage()));
    }

}
