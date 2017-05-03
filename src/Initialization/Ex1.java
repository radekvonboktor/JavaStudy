package Initialization;

/**
 * Created by mavdjiev on 26.4.2017 г..
 */


class UninitializedString{
    String name;
    UninitializedString(){
        System.out.println(name);
    }
}

public class Ex1 {
    public static void main(String[] args) {
        new UninitializedString();
    }
}
