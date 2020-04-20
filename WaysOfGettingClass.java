package javatraining.oletsky.reflection;

/**
 * @author O.Oletsky
 *
 * Three ways of getting instances of Class
 */
public class WaysOfGettingClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("java.lang.String");
        Class c2 = "qwerty".getClass();
        Class c3 = String.class;

        //Are they the same?
        System.out.println(c1==c2); //true
        System.out.println(c2==c3); //true

        //Which class?
        System.out.println(c1.getSimpleName()); //String
    }
}
