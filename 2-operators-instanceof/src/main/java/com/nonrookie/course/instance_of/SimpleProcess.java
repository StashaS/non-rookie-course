package com.nonrookie.course.instance_of;

public class SimpleProcess implements Processable {

    @Override
    public void process(String o) {
        System.out.println("SimpleProcess process print: " + o);
    }

}
