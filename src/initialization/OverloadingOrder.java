package initialization;

/**
 * Created by mavdjiev on 26.4.2017 г..
 */
public class OverloadingOrder {
    static void f(String s, int i){
        System.out.println("String: " + s + ", int: " + i);
    }
    static void f(int i, String s){
        System.out.println("int: " + i + ", String: " + s);
    }

    public static void main(String[] args) {
        f("String first", 11);
        f(99, "Int first");
    }
}
