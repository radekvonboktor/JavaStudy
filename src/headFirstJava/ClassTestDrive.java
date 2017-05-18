package headFirstJava;

/**
 * Created by mavdjiev on 17.5.2017 г..
 */
public class ClassTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("12345");
        String tod = c.getTime();
        System.out.println(tod);
    }
}
