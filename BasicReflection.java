package javatraining.oletsky.reflection;

import java.lang.reflect.Method;

/**
 * @author O.Oletsky
 * Demonstrates basic possibilities of reflection
 * Own name and superclass
 * List of methods
 */
public class BasicReflection {
    public static void main(String[] args) {
        //Getting class and superclass
        Class kl = Class.class;
        System.out.println (kl.getSimpleName() + " is a subclass of " +
                kl.getSuperclass().getSimpleName());
        System.out.println("------------");
        System.out.println("Public methods:");
        Method[] publMetods  = kl.getMethods();
        for (Method m:publMetods) {
            System.out.println(m);
        }

        System.out.println("------------");
        System.out.println("Declared methods:");
        Method[] declMetods  = kl.getDeclaredMethods();
        for (Method m:declMetods) {
            System.out.println(m);
        }



    }
}
