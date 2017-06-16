package homeworkConstructors.vendingMachine;

import java.util.Scanner;

/**
 * Created by Mars on 6/5/2017.
 */
public class ItemLogic implements Item {
    public double PRICE;
    public String NAME;
    public String CODE;
    public double inputPrice;
    public String inputCode;

    public static ItemLogic[] items = new ItemLogic[3];

    Scanner priceReader = new Scanner(System.in);
    Scanner codeReader = new Scanner(System.in);


    public String getName() {
        return NAME;
    }

    public void initializeItems(){
            items[0] = new Cola();
            items[1] = new Chips();
            items[2] = new Crackers();
        }

    public void startTheMachine(){
        initializeItems();
        for(int i = 0; i < items.length; i++){
            System.out.println(items[i].getName());
        }
    }

    public void performChecks() {
        inputPrice = priceReader.nextDouble();
        inputCode = codeReader.nextLine();
        initializeItems();
        boolean found = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].checkCode(inputCode)) {
                found = true;
                if (items[i].checkPrice(inputPrice)) {
                    System.out.println("You ordered " + items[i].getName() + " here it is");
                    break;
                } else {
                    System.out.println("Sorry, the amount is not enough for this purchase. Please add more money and try again");
                }
            }
        }
        if(!found){
            System.out.println("Sorry, we don't have item with such a code");
        }
    }

    @Override
    public boolean checkPrice(double priceInput) {
        return PRICE <= priceInput;
    }

    @Override
    public boolean checkCode(String codeInput) {
        return CODE.contains(codeInput);
    }


}
