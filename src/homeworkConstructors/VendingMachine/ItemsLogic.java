package homeworkConstructors.VendingMachine;

import java.util.Scanner;

/**
 * Created by Mars on 6/5/2017.
 */
public class ItemsLogic implements Items {
    public double price;
    public String name;
    public String code;
    public double inputPrice;
    public String inputCode;

    public static ItemsLogic[] items = new ItemsLogic[3];

    Scanner priceReader = new Scanner(System.in);
    Scanner codeReader = new Scanner(System.in);


    public String getName() {
        return name;
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
        if (price <= priceInput) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkCode(String codeInput) {
        if(code.contains(codeInput)){
            return true;
        } else {
            return false;
        }
    }


}
