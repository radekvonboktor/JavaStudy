package Initialization;

/**
 * Created by mavdjiev on 26.4.2017 г..
 */

class Test{
    String name = "Bill";
    Test(){
        System.out.println(name);
    }
}

public class Ex2 {
    public static void main(String[] args) {
        new Test();
    }
}
