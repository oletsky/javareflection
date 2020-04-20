package javatraining.oletsky.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author O.Oletsky
 * Demonstrates methods as parameters of other method
 * This was the only technique before Java 8
 */
public class DemoMethodAsParameter {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = Math.class.getMethod("exp", double.class);
        executeMethod(method, 1.);
    }

    static void executeMethod (Method method, double x) throws InvocationTargetException, IllegalAccessException {
        System.out.println(method.invoke(null, x));
    }
}
