package objectOrientedP.overriding;

/**
 * Created by mavdjiev on 15.5.2017 г..
 */
class Animal{
    public void move() {
        System.out.println("Animals can move");
    }
}

class Dog extends Animal{
    public void move(){
        super.move();
        System.out.println("Dogs can move");
    }
}
public class TestDog {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();
        a.move();
        d.move();
    }
}
