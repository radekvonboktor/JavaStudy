package ObjectExcercises;

/**
 * Write a program that includes and calls the
 * storage() method defined as a code fragment in
 * this chapter.
 */
public class Exercise6 {
    String s = "Hello, World!";

    int storage(String s) {
        return s.length() * 2;
    }
    void print() {
        System.out.println("storage(s) = " + storage(s));
    }

    public static void main(String[] args) {
        Exercise6 st = new Exercise6();
        st.print();
    }
}
