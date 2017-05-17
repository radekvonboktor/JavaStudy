package headFirstJava_GuessingGame;

/**
 * Created by mavdjiev on 16.5.2017 г..
 */
public class Player {
    int number = 0;

    public void guess(){
        number = (int)(Math.random()*10);
        System.out.println("I'm guessing " + number);
    }
}
