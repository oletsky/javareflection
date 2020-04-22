package javatraining.oletsky.numerics;

import java.lang.reflect.Field;
import java.util.HashSet;

/**
 * @author O.Oletsky
 * If you are sure that HashSet<Integer> can't contain two identical values
 * you are wrong
 * This code shows how to do this
 * Oracle promises to put an end
 * to these opportunities but now they are still possible
 */

public class DuplicatesInHashSet {
    public static void main(String[] args) throws Exception {
        System.err.close();
        Field f = Integer.class.getDeclaredField("value");
        f.setAccessible(true);
        Integer n1 = 10;
        Integer n2 = 100;
        HashSet<Integer> set = new HashSet<>();
        set.add(n1);
        set.add(n2);
        f.set(n1, 100);
        System.out.println(set);
    }
}
