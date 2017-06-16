package factoryDesignPattern;

/**
 * Created by mavdjiev on 8.6.2017 г..
 */
 class SiberianHusky implements Dog {

    @Override
    public void speak() {
        System.out.println("The husky says \"Dude, what's up?\"");
    }

}
