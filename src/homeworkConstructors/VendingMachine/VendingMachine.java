package homeworkConstructors.VendingMachine;

import java.util.Scanner;

/**
 * Created by Mars on 6/5/2017.
 */
public class VendingMachine {
    private static double priceInput;
    private static String nameInput;
    private static int i;
    private static ItemsLogic[] items = new ItemsLogic[3];

    Scanner nameReader = new Scanner(System.in);
    Scanner priceReader = new Scanner(System.in);

    private static void startTheMachine(){
        initializeItems();
        for(i = 0; i < items.length; i++){
            System.out.println(items[i].getName());
        }
    }

    private static void initializeItems(){
        items[0] = new Cola();
        items[1] = new Chips();
        items[2] = new Crackers();
    }



    public void performChecks() {
        priceInput = priceReader.nextDouble();
       loop: while(true){
           nameInput = nameReader.nextLine();
            switch(nameInput){
                case "A1": Cola colaItem = new Cola();
                                    if(colaItem.checkPrice(priceInput)){
                                            System.out.println("You ordered " + colaItem.getName()+ ", here is it");
                                    } else {
                                            System.out.println("Sorry, the amount is not enough for this purchase. Please add more money and try again");
                                    }
                                    break loop;
                case "B2": Chips chipsItem = new Chips();
                                    if(chipsItem.checkPrice(priceInput)){
                                        System.out.println("You ordered " + chipsItem.getName()+ ", here is it");
                                    } else {
                                        System.out.println("Sorry, the amount is not enough for this purchase. Please add more money and try again");
                                    }
                                    break loop;
                case "C3": Crackers crackerItem = new Crackers();
                                    if(crackerItem.checkPrice(priceInput)){
                                        System.out.println("You ordered " + crackerItem.getName()+ ", here is it");
                                    } else {
                                        System.out.println("Sorry, the amount is not enough for this purchase. Please add more money and try again");
                                    }
                                        break loop;
                default:
                    System.out.println("Sorry, we don't have item with such a code");
            }
        }
     }



    public static void main(String[] args) {
        System.out.println("Please put money in the money tray:");
        VendingMachine vm = new VendingMachine();
        vm.startTheMachine();
        vm.performChecks();

    }
}
