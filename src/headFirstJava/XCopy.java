package headFirstJava;

/**
 * Created by mavdjiev on 17.5.2017 г..
 */
public class XCopy {
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }

    int go(int arg){
        arg = arg * 2;
        return arg;
    }
}
