package javatraining.oletsky.reflection;

import java.lang.reflect.Method;

/**
 * @author O.Oletsky
 * Demonstrates how to call a private method
 */
public class PrivacyViolation {
    public static void main(String[] args) throws Exception {
        MyClass ekz = new MyClass();
        Method met = MyClass.class.getDeclaredMethod("foo");
        met.setAccessible(true);
        met.invoke(ekz);
    }
}

class MyClass {
    private void foo(){
        System.out.println("Privacy violation is forbidden!");
    }
}
