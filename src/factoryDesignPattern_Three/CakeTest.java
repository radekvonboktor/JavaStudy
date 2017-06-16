package factoryDesignPattern_Three;

import java.util.Scanner;

/**
 * Created by mavdjiev on 12.6.2017 г..
 */
public class CakeTest {
    public static void main(String[] args) {
        Cake cake;

        System.out.println("Which Cake you would like to eat Black Forest/Blue Berry/ Litchi Gateaux/ Pineapple");
        Scanner reader = new Scanner(System.in);
        String choice = reader.nextLine();
        reader.close();

        CakeFactory cakeFactory = new CakeFactory();
        cake  = cakeFactory.createCake(choice);
        cake.aboutCake();
    }
}
