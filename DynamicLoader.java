package javatraining.oletsky.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author O.Oletsky
 * A very useful application of reflection
 * The name of needed class becomes known during the run of a program
 * A factory method is used
 *
 * But this implementation is not good enough.
 * Try to refactor it using abstract classes or interfaces firstly
 * and Properties secondly
 */
public class DynamicLoader {
    public static void main(String[] args) {
        Object ekz = FactoryMethod.getInstance();
        try {
            Method  met = ekz.getClass().getMethod("doSmth");
            try {
                met.invoke(ekz);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

class FactoryMethod {
    public static Object getInstance() {
        final String PAK_NAME ="";
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name of needed class");
        String clName=PAK_NAME+scan.nextLine();

        switch(clName) {
            case "K1": return new K1();
            case "K2": return new K2();
            default: throw new RuntimeException("No suitable class found");
        }
    }
}

class K1 {
    public void doSmth() {
        System.out.println("First algorithm realized");
    }
}

class K2 {
    public void doSmth() {
        System.out.println("Second algorithm realized");
    }
}
