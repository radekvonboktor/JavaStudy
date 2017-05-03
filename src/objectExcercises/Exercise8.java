package objectExcercises;

/** Write a program to demonstrate that no
 * matter how many objects you create of a
 * particular class, there is only one instance
 * of a particular static field in that class.
 */
public class Exercise8 {
    static int i = 47;

    public static void main(String[] args) {
        Exercise8 st1 = new Exercise8();
        Exercise8 st2 = new Exercise8();
        System.out.println(st1.i + " == " + st2.i);
        st1.i++;
        System.out.println(st1.i + " == " + st2.i);
    }
}
