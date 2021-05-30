package com.nonrookie.course.var;

import java.util.ArrayList;

public class DemoVar {

    static {
        System.out.println("WRAPPER CLASSES");
    }

    static {
        var text = "String initialization in initializer block";
        System.out.println(text);
    }

    public static void demonstration(){
        var text = "String initialization in method";
        System.out.println(text);

        var text2 = new String();
        var text3 = (String) null;
        var number = 1.0;
        var var = "var";

        var list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        for(var item: list){
            System.out.println(item);
        }
    }

    private static void var(String var){
        var a = var;
        System.out.println(a);
    }

    private void varBenefitDemo(){
        VeryLongNameOfClass.VeryLongNameInnerClass testInner1 = new VeryLongNameOfClass.VeryLongNameInnerClass();
        var testInner2 =  new VeryLongNameOfClass.VeryLongNameInnerClass();

        var testInner3 = new VeryLongNameOfClass.VeryLongNameInnerClass().text;
    }

}
