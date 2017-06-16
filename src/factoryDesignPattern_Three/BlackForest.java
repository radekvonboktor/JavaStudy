package factoryDesignPattern_Three;

/**
 * Created by mavdjiev on 12.6.2017 г..
 */
public class BlackForest extends Cake {

    public BlackForest(){
        setName("Black Forest");
        setType("Eggless");
        setPrice(800);
    }

    public void recipe(){
        System.out.println("---BlackForest Recipe---");
        System.out.println("Sieve together Maida and Cocoa powder");
        System.out.println("Add Milk and Vanilla essence");
        System.out.println("Top with Whipped Cream and Cherries");
        System.out.println("Chill and Serve");
    }

    public void myFans(){
        System.out.println("Both adults and kids love me");
    }

}
