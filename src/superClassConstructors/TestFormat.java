package superClassConstructors;

/**
 * Created by mavdjiev on 31.5.2017 г..
 */
public class TestFormat {
    public static void main(String[] args) {
        String s = String.format("%, d", 1000000000);
        System.out.println(s);
    }
}
