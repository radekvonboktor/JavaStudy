package superClassConstructors;

/**
 * Created by mavdjiev on 30.5.2017 г..
 */
public class PlayerTestDriver {
    public static void main(String[] args) {
        System.out.println(Player.playerCount);
        Player p = new Player("Jeff");
        System.out.println(Player.playerCount);
        Player n = new Player("Jeff");
        System.out.println(Player.playerCount);
        Player m = new Player("Jeff");
        System.out.println(Player.playerCount);
    }
}
