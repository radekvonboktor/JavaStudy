package factoryDesignPattern;

/**
 * Created by mavdjiev on 9.6.2017 г..
 */
public class JavaFactoryPatternExample {
    public static void main(String[] args) {
        Dog dog = DogFactory.getDog("small");
        dog.speak();

        dog = DogFactory.getDog("big");
        dog.speak();

        dog = DogFactory.getDog("working");
        dog.speak();

    }
}
