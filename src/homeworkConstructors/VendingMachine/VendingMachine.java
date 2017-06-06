package homeworkConstructors.VendingMachine;

import java.util.Scanner;

/**
 * Created by Mars on 6/5/2017.
 */
public class VendingMachine {
    private static double priceInput;
    private static String nameInput;
    private static int i;
    private static int y;
    private static ItemsLogic[] items = new ItemsLogic[3];

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

    public void performNameChecks(String nameInput){
        initializeItems();
        for(i = 0; i < items.length; i++){
            String itemName = items[i].getName();
            while(itemName.contains(nameInput)){
                System.out.println("You ordered " + items[i].getName() +", here is it");
                break;
            }
        }
    }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please put money in the money tray:");
        VendingMachine vm = new VendingMachine();
        vm.startTheMachine();
        nameInput = reader.nextLine();
        vm.performNameChecks(nameInput);

    }
}
