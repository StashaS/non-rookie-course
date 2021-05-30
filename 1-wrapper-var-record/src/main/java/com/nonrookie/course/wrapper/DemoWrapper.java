package com.nonrookie.course.wrapper;

public class DemoWrapper {

    private static int initNumber;
    private static Integer initWrappedNumber;

    public static void demonstration(){
        System.out.println("WRAPPER CLASSES");
        autoboxingUnboxingDemo();
        initValueDemo();
        equalDemo();
    }

    private static void autoboxingUnboxingDemo(){
        int number = 5;

        // autoboxing
        Integer wrapperNumber = number;
        System.out.println("Type of wrapperNumber " + wrapperNumber.getClass().toString());

        //unboxing
        int unboxedNumber = wrapperNumber;
        System.out.println("Unboxed number " + unboxedNumber);

        System.out.println("Is number == unboxedNumber? " + (number == unboxedNumber) + "\n");
    }

    private static void initValueDemo(){
        System.out.println("Init int " + initNumber);
        System.out.println("Init Integer " + initWrappedNumber);

        ExamplePojo examplePojo = new ExamplePojo("test");
        System.out.println("examplePojo " + examplePojo + "\n");
    }

    private static void equalDemo(){
        printIntEqualInteger(5);
        printIntEqualInteger(500);

        printIntegerEqualInteger(5);
        printIntegerEqualInteger(500);

        int i = -500;
        while(i < 500){
            i++;
            System.out.println(i + "  " + (Integer.valueOf(i) == Integer.valueOf(i)));
        }
    }

    private static void printIntEqualInteger(int number){
        System.out.println("printIntEqualInteger " + number);
        Integer wrappedNumber = number;
        System.out.println("Is number == wrappedNumber? " + (number == wrappedNumber));
        System.out.println("Is wrappedNumber equals number? " + wrappedNumber.equals(number) + "\n");
    }

    private static void printIntegerEqualInteger(int number){
        System.out.println("printIntegerEqualInteger " + number);
        Integer wrappedNumber1 = number;
        Integer wrappedNumber2 = number;
        System.out.println("Is number == wrappedNumber? " + (wrappedNumber1 == wrappedNumber2));
        System.out.println("Is wrappedNumber equals number? " + wrappedNumber1.equals(wrappedNumber2) + "\n");
    }

}
