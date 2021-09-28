package com.nonrookie.course.sealed;

/**
 * Description
 *
 * @author ASarycheva
 * @version %I%, %G%
 */
public sealed class DemoSealed2 {

    public static void demonstration() {
        System.out.println("SEALED CLASSES");
    }

    public static final class ChildClass1 extends DemoSealed2 {
    }

    public static final class ChildClass2 extends DemoSealed2 {
    }
}
