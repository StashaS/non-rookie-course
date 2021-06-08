package com.nonrookie.course.instance_of;

import java.util.LinkedList;
import java.util.List;

public class DemoInstanceof {

    public static void demonstration() {
        System.out.println("INSTANCEOF");
        simpleDemo();

        usingInstanceof(new SimpleProcess());
        usingInstanceof("It's a String");

//        unSaveTyping(new SimpleProcess());
//        unSaveTyping("It's a String");

        patternMatchingDemo(new SimpleProcess());
    }

    private static void simpleDemo(){
        instanceOfChecker("text");
        instanceOfChecker(Integer.valueOf(5));

        int a = 5;
        instanceOfChecker(a);

        System.out.println(null instanceof Object);

        instanceOfChecker(new SimpleProcess());
        instanceOfChecker(new LinkedList<String>());

        Integer[] b = {1, 2};
        instanceOfChecker(b);
    }

    private static void instanceOfChecker(Object object){
        System.out.println("object = " + object + ", class = " + object.getClass());
        if(object instanceof Object){
            System.out.println("It is Object");
        }
        if(object instanceof String){
            System.out.println("It is String");
        }

        if(object instanceof Processable){
            System.out.println("It is Processable");
        }
        if(object instanceof SimpleProcess){
            System.out.println("It is SimpleProcess");
        }

        if(object instanceof List){
            System.out.println("It is List");
        }
        if(object instanceof List<?>){
            System.out.println("It is List<?>");
        }
//        if(object instanceof List<String>){
//            System.out.println("It is List<String>");
//        }

        if(object instanceof Integer[]){
            System.out.println("It is Integer[]");
        }
    }

    private static void usingInstanceof(Object object){
        if(object instanceof SimpleProcess){
            SimpleProcess simpleProcess = (SimpleProcess) object;
            simpleProcess.process("text");
        }
    }

    private static void unSaveTyping(Object object){
        SimpleProcess simpleProcess = (SimpleProcess) object;
        simpleProcess.process("text");
    }

    private static void patternMatchingDemo(Object object){
        if(object instanceof SimpleProcess simpleProcess){
            simpleProcess.process("Pattern Matching for instanceof");
        }
    }
}
