package Initialization;

/**
 * Created by mavdjiev on 26.4.2017 г..
 */
class Person {
    public void eat(Apple apple) {
        Apple pealed = apple.getPeeled();
        System.out.println("Yummy");
    }
}

    class Peeler{
        static Apple peel(Apple apple){
            return apple;
        }
    }
    class Apple{
        Apple getPeeled() {
            return Peeler.peel(this);
        }
    }
public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
