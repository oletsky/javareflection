package javatraining.oletsky.javastrings;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author O.Oletsky
 *
 * If you are sure that Java strings allocated in memory
 * are totally immutable you are wrong.
 * This code shows how to change a string in even a more creepy way
 * than it is usually carried out. Oracle promises to put an end
 * to these opportunities but now they are still possible
 */

public class HackTheString {
    public static void main(String[] args) throws Exception{
        System.err.close();
        Field v = String.class.getDeclaredField("value");
        v.setAccessible(true);
        byte[] bar = (byte[]) v.get("rat");
        Arrays.sort(bar);
        System.out.println("rat"); //art
        System.out.println("rat".equals("art")); //true
    }
}
