package com.nonrookie.course.sealed;


/**
 * Description
 *
 * @author ASarycheva
 * @version %I%, %G%
 */
public sealed class DemoSealed permits ChildDemoSealed, ChildDemoSealed2, ChildDemoSealed3 {

    public static void demonstration() {
        System.out.println("SEALED CLASSES");
    }

}
