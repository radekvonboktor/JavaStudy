package homeworkConstructors.vendingMachine_Refactored;

import java.util.Scanner;

/**
 * Created by mavdjiev on 12.6.2017 г..
 */
public class Item {
    double price;
    String name;
    String code;

    Item item;

    public void setPrice(double price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCode(String code) {
        this.code = code;
    }


    public boolean checkPrice(double priceInput) {
        return price <= priceInput;
    }
    public boolean checkCode(String codeInput) {
        return code.equals(codeInput);
    }

    public void startTheMachine(double inputPrice, String inputCode){

        boolean found = false;

        while (!found) {
            try{
                ItemFactory itemFactory = new ItemFactory();
                item = itemFactory.createItem(inputCode);

                if (item.checkCode(inputCode)) {
                    found = true;
                    if (item.checkPrice(inputPrice)) {
                        System.out.println("You ordered " + item.getName() + " here it is");
                    } else {
                        System.out.println("Sorry, the amount is not enough for this purchase. Please add more money and try again");
                    }
                }
            } catch (NullPointerException e){
                System.out.println("Sorry, we don't have an item with such code");
                System.out.println("Please check the available items in the message");
                Scanner in = new Scanner(System.in);
                inputCode = in.nextLine();
            }
        }

    }
}

