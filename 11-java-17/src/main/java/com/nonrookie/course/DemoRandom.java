package com.nonrookie.course;

import java.util.Random;
import java.util.random.RandomGenerator;

/**
 * Description
 *
 * @author ASarycheva
 * @version %I%, %G%
 */
public class DemoRandom {

    public static void demonstration() {
        System.out.println("RANDOM");

        Random random = new Random();
        System.out.println(random.nextInt());

        RandomGenerator generator = RandomGenerator.getDefault();
        var intStream = generator.ints(100);
        intStream.forEach(System.out::println);
    }

}
