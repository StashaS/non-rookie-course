package com.nonrookie.course.operator;

public class DemoOperator {

    public static void demonstration() {
        System.out.println("OPERATORS");
        assigmentDemo();
        shortCircuitDemo();

        checkLengthSave(null);
//        checkLengthUnSave(null);

        sideEffectShortCircuit();
    }

    private static void assigmentDemo() {
        int a = 5, b, c = 3;
        System.out.println(b = a);
        if ((c += a) > 0) {
            System.out.println("Some activity: " + c);
        }
    }

    private static void shortCircuitDemo() {
        if (false && true && true) {
            System.out.println("It will be never printed");
        }
        if (true || false || false) {
            System.out.println("It will be printed everytime");
        }
    }

    private static void checkLengthSave(String a) {
        if (a != null && a.length() > 3) {
            System.out.println("Length > 3");
        } else {
            System.out.println("Length <= 3");
        }

//        if (a != null){
//            if (a.length() > 3){
//                System.out.println("Length > 3");
//            }
//        } else {
//            System.out.println("Length <= 3");
//        }
    }

    private static void checkLengthUnSave(String a) {
        if (a.length() > 3 && a != null) {
            System.out.println("Length > 3");
        } else {
            System.out.println("Length <= 3");
        }
    }

    private static void sideEffectShortCircuit(){
        int a = 1, b = 2;

        if(a > 0 || (b += 10) > 0){
            System.out.println("Side effect short-citcuit: a = " + a + ", b = " + b);
        }
    }

}
