package ObjectExcercises;

/**
 * Write a program to demonstrate that
 * autoboxing works for all the primitive types
 * and their wrappers.
 */
public class Exercise9 {
    public static void main(String[] args) {
        Byte by = 1;
        byte bt = by;
        System.out.println("byte = " + bt);
        Short sh = 1;
        short s = sh;
        System.out.println("short = " + s);
        Integer in = 1;
        int i = in;
        System.out.println("int = " + i);
        Boolean bo = true;
        boolean b = bo;
        System.out.println("boolean = " + b);
        Character ch = 'x';
        char c = ch;
        System.out.println("char = " + c);
        Float fl = 1.0f;
        float f = fl;
        System.out.println("float = " + f);
        Double db = 1.0d;
        double d = db;
        System.out.println("double = " + d);
    }
}
