package ObjectExcercises;

/**
 * Turn the Incrementable code fragments into a
 * working program.
 */
public class Exercise7 {
    static void increment() {
        StaticTest.i++;
    }

    public static void main(String[] args) {
        Exercise7 sf = new Exercise7();
        sf.increment();
        Exercise7.increment();
        increment();
    }
}

class StaticTest{
    static int i = 47;
}
