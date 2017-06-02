package superClassConstructors;

/**
 * Created by mavdjiev on 30.5.2017 г..
 */
public class Player {
    static int playerCount;
    private String name;

    public Player(String n){
        name = n;
        playerCount++;
    }
}
