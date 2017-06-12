package homeworkConstructors.vendingMachine_Refactored;


import java.util.Scanner;

/**
 * Created by mavdjiev on 12.6.2017 г..
 */
public class VendingMachine {
    public static void main(String[] args) {

        ItemFactory itemFactory = new ItemFactory();
        itemFactory.displayOptions();

        Scanner codeReader = new Scanner(System.in);
        Scanner priceReader = new Scanner(System.in);

        double inputPrice = priceReader.nextDouble();
        String inputCode = codeReader.nextLine();

        Item item = new Item();
        item.startTheMachine(inputPrice, inputCode);

    }

}
