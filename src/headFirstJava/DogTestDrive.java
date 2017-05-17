package headFirstJava;

/**
 * Created by mavdjiev on 16.5.2017 г..
 */
public class DogTestDrive {
    public static void main(String[] args) {
        Dog dOne = new Dog();
        Dog dTwo = new Dog();

        dTwo.size = 61;
        dOne.size = 40;
        dOne.breed = "Doberman";
        dOne.name = "Sparky";
        dOne.bark();
        dTwo.bark();

        System.out.println("The dog is: " + dOne.size + " kgs");
        System.out.println("The dog's breed is: " + dOne.breed);
        System.out.println("The dog's name is: " + dOne.name);
    }
}
