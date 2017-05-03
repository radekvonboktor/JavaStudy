package object;

import java.util.Date;

/** The first Thinking in Java example program
 * Displays a string and today's date.
 * @author mavdjiev
 * @author m.avdjiev@softserveinc.com
 * @version 0.1
 */
public class HelloDate {
    /** Entry point to class & application.
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
    }
}
