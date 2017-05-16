package objectOrientedP.inheritance;

/**
 * Created by mavdjiev on 15.5.2017 г..
 */
interface Animal1{}
class Mammal1 implements Animal1{}

public class Dog1 extends Mammal1{
    public static void main(String[] args) {
        Mammal1 m = new Mammal1();
        Dog1 d = new Dog1();

        System.out.println(m instanceof  Animal1);
        System.out.println(d instanceof  Mammal1);
        System.out.println(d instanceof Animal1);
    }
}
